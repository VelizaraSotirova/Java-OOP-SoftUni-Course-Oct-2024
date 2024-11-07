package Lab._04_WildFarm;

public abstract class Mammal extends Animal {
    private final String livingRegion;

    public Mammal(String type, String name, Double weight, String livingRegion) {
        super(type, name, weight);
        this.livingRegion = livingRegion;
    }
}
