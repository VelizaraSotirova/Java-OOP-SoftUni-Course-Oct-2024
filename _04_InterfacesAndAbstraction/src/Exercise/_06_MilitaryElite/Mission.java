package Exercise._06_MilitaryElite;

public class Mission {
    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        this.state = state;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Code Name: " + codeName + " State: " + state;
    }
}
