package Exercise._06_MilitaryElite;

import java.util.*;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }

    @Override
    public void addMission(Mission mission) {
        if (MissionState.isValidState(mission.getState())) {
            missions.add(mission);
        }
    }

    @Override
    public Collection<Mission> getMissions() {
        return missions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + "\nMissions:");
        for (Mission mission : missions) {
            sb.append("\n  ").append(mission.toString());
        }
        return sb.toString();
    }
}

