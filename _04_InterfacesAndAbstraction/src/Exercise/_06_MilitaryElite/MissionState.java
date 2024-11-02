package Exercise._06_MilitaryElite;

public enum MissionState {
    inProgress, finished;

    public static boolean isValidState(String state) {
        return state.equals("inProgress") || state.equals("finished");
    }
}
