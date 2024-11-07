package Lab._04_WildFarm;

public class Tiger extends Feline {

    public Tiger(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Meat)) {
            System.out.println("Tigers are not eating that type of food!");
            return;
        }
        super.eat(food);
    }
}
