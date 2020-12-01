package by.epam.unit5.payment;

enum Currency {
    BYN("belarusian ruble", 2.7),
    USD("dollar", 1.0),
    EUR("euro", 0.91);

    private String name;
    private double rate;

    Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}