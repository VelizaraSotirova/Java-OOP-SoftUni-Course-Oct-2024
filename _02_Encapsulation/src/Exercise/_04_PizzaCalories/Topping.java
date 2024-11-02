package Exercise._04_PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    public double calculateCalories() {
        double toppingTypeCoefficient = 0;

        switch (toppingType) {
            case "Meat" -> toppingTypeCoefficient = 1.2;
            case "Veggies" -> toppingTypeCoefficient = 0.8;
            case "Cheese" -> toppingTypeCoefficient = 1.1;
            case "Sauce" -> toppingTypeCoefficient = 0.9;
        }

        return (2 * weight) * toppingTypeCoefficient;
    }

    private void setToppingType(String toppingType) {
        if (!toppingType.equals("Meat") && !toppingType.equals("Veggies") && !toppingType.equals("Cheese") && !toppingType.equals("Sauce")) {
            String message = String.format("Cannot place %s on top of your pizza.", toppingType);
            throw new IllegalArgumentException(message);
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            String message = String.format("%s weight should be in the range [1..50].", toppingType);
            throw new IllegalArgumentException(message);
        }
        this.weight = weight;
    }
}
