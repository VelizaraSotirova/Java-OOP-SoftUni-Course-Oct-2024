package Exercise._06_MilitaryElite;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private String corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        if (!Corps.isValidCorps(corps)) {
            throw new IllegalArgumentException("Invalid corps");
        }
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return corps;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCorps: " + corps;
    }
}

