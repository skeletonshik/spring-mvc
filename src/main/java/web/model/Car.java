package web.model;

public class Car {

    private String model;
    private int yearMade;
    private int price;

    public Car(String model, int yearMade, int price) {
        this.model = model;
        this.yearMade = yearMade;
        this.price = price;
    }

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
