package by.epam.unit5.entity;

public enum CandyType implements Type {
    CARAMEL("Caramel", 10),
    CHOCOLATE("Chocolate", 25),
    GUMMIES("Gummies", 15),
    LICORICE("Licorice", 20);
    private final String name;
    private final int price;

    CandyType(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}