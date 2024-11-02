package Lab._02_CarShopExtended;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        String firstRow = super.toString();
        String secondRow = "%s sells for %f".formatted(getModel(), getPrice());

        sb.append(firstRow).append(System.lineSeparator());
        sb.append(secondRow);

        return sb.toString();
    }
}
