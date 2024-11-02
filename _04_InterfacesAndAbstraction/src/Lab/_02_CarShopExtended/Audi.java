package Lab._02_CarShopExtended;

public class Audi extends CarImpl implements Rentable {

    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        String firstRow = super.toString();
        String secondRow = "Minimum rental period of %d days. Price per day %f".formatted(getMinRentDay(), getPricePerDay());

        sb.append(firstRow).append(System.lineSeparator());
        sb.append(secondRow);

        return sb.toString();
    }
}