package Exercise._06_MilitaryElite;

public enum Corps {
    Airforces, Marines;

    public static boolean isValidCorps(String corps) {
        return corps.equals("Airforces") || corps.equals("Marines");
    }
}
