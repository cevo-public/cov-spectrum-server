package ch.ethz.covspectrum.entity.core;

public class PangolinLineageAlias {
    private final String alias;
    private final String fullName;

    public PangolinLineageAlias(String alias, String fullName) {
        this.alias = alias;
        this.fullName = fullName;
    }

    public String getAlias() {
        return alias;
    }

    public String getFullName() {
        return fullName;
    }
}
