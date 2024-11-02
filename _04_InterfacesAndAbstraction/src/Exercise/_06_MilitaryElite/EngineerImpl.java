package Exercise._06_MilitaryElite;

import java.util.*;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    @Override
    public void addRepair(Repair repair) {
        repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + " Repairs:");
        for (Repair repair : repairs) {
            sb.append("\n  ").append(repair.toString());
        }
        return sb.toString();
    }
}

