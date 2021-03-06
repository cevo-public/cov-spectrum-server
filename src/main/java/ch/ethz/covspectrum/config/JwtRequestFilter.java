package ch.ethz.covspectrum.config;

import ch.ethz.covspectrum.service.JwtUserDetailsService;
import ch.ethz.covspectrum.util.JwtTokenService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    private final JwtUserDetailsService jwtUserDetailsService;

    private final JwtTokenService jwtTokenService;


    public JwtRequestFilter(JwtUserDetailsService jwtUserDetailsService, JwtTokenService jwtTokenService) {
        this.jwtUserDetailsService = jwtUserDetailsService;
        this.jwtTokenService = jwtTokenService;
    }


    /**
     * This function looks for the "Authorization" header and validates the JWT token if one is present.
     *
     * TODO Better handling of error cases such as expired tokens. See: JwtTokenValidationService#validateJwtToken
     */
    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain chain
    ) throws ServletException, IOException {
        // First check if a JWT token is provided as query param
        String jwtToken = request.getParameter("jwt");

        // If not, check the Authorization header
        if (jwtToken == null || jwtToken.isBlank()) {
            String requestTokenHeader = request.getHeader("Authorization");
            if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
                jwtToken = requestTokenHeader.substring(7); // Removes "Bearer " prefix
            }
        }

        if (jwtToken != null) {
            try {
                String restrictionEndpoint = jwtTokenService.getRestrictionEndpoint(jwtToken);
                if (restrictionEndpoint != null && !restrictionEndpoint.equals(request.getRequestURI())) {
                    response.setStatus(401);
                    return;
                }

                String username = jwtTokenService.getUsername(jwtToken);
                UserDetails userDetails = this.jwtUserDetailsService.loadUserByUsername(username);
                if (jwtTokenService.validateToken(jwtToken, userDetails)) {
                    var usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                            userDetails, null, userDetails.getAuthorities());
                    usernamePasswordAuthenticationToken
                            .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
                }
            } catch (Exception e) {
                response.setStatus(401);
                return;
            }
        }

        chain.doFilter(request, response);
    }

}
