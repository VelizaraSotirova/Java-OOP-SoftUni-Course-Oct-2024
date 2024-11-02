package Exercise._06_MilitaryElite;

public class Repair {
    private String partName;
    private int hoursWorked;

    public Repair(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Part Name: " + partName + " Hours Worked: " + hoursWorked;
    }
}
