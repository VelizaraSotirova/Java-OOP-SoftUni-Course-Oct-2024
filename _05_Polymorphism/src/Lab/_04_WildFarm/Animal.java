package Lab._04_WildFarm;

public abstract class Animal {
    private final String animalName;
    private final String animalType;
    private final Double animalWeight;
    private Integer foodEaten;

    public Animal(String animalType, String animalName, Double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
    }

    public abstract void makeSound();

    public void eat(Food food) {
        foodEaten += food.getQuantity();
    }
}
