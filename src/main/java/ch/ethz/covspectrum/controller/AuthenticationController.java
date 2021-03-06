package ch.ethz.covspectrum.controller;

import ch.ethz.covspectrum.service.JwtUserDetailsService;
import ch.ethz.covspectrum.util.JwtTokenService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;


@RestController
@CrossOrigin
@RequestMapping("/internal")
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;

    private final JwtTokenService jwtTokenService;

    private final JwtUserDetailsService userDetailsService;


    public AuthenticationController(
            AuthenticationManager authenticationManager,
            JwtTokenService jwtTokenService,
            JwtUserDetailsService userDetailsService
    ) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenService = jwtTokenService;
        this.userDetailsService = userDetailsService;
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JwtResponse login(@RequestBody JwtRequest authenticationRequest) {
        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        String token = jwtTokenService.generateToken(userDetails);
        return new JwtResponse(token);
    }


    /**
     * Creates a JWT token for the current user that lasts 3 minutes and only allows access to a defined endpoint (not
     * exact path, i.e., that query params are ignored).
     * If the endpoint is called by a not-logged-in user, null will be returned.
     */
    @RequestMapping(value = "/create-temporary-jwt", method = RequestMethod.POST)
    public JwtResponse createTemporaryJwt(
            @RequestParam String restrictionEndpoint,
            Principal principal
    ) {
        if (principal == null) {
            return null;
        }
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        Map<String, Object> claims = new HashMap<>() {{
            put("restriction_endpoint", restrictionEndpoint);
        }};
        String token = jwtTokenService.generateToken(userDetails, 3 * 60, claims);
        return new JwtResponse(token);
    }


    private void authenticate(String username, String password) {
        // TODO Improve error handling (e.g., wrong credentials)
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
    }
}
