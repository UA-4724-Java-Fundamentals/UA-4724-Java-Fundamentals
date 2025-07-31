package module06;

public class PrTask02 {
    public static void main(String[] args) {
        Car[] cars ={
                new Truck("MAN",120,2024),
                new Truck("MAN",80,2004),
                new Sedan("BMW", 180,2019),

        }  ;
        for( var car : cars ){
            System.out.println(car);
            //car.run();
        }
        for( var car : cars ){
            System.out.println(car.getClass().getSimpleName());
        }
        for( var car : cars ){
            car.run();
        }
        for( var car : cars ){
            car.stop();
        }
    }
}

abstract class Car {
    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    abstract void run();
    abstract void stop();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Truck " + getModel() + " run at max speed " + getMaxSpeed()  + "and year of production " + getYearOfProduction());
    }

    @Override
    void stop() {
        System.out.println("Truck " + getModel() + " stops. ");
    }


}

class Sedan extends Car {

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Sedan " + getModel() + " run at max speed " + getMaxSpeed()  + "and year of production " + getYearOfProduction());
    }

    @Override
    void stop() {
        System.out.println("Sedan " + getModel() + " stops. ");
    }
}
