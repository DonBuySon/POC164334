package pl.cars.zad10;

public class Car {
    private String brand;
    private String model;
    private double price;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 50000;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}