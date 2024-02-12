package HW_2;

public class Carr extends Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public Carr(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 4;
        this.speed = 0;
    }

    @Override
    public void testDrive() {
        this.speed = 60;
    }

    @Override
    public void park() {
        this.speed = 0;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "This car is a “ + year + “ “ + make + “ “ + model + ";
    }
}
