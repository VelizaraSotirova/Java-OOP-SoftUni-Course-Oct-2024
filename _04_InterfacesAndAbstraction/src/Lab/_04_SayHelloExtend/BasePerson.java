package Lab._04_SayHelloExtend;

public abstract class BasePerson implements Person {
    private String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    private void setName() {
        this.name = name;
    }
}
