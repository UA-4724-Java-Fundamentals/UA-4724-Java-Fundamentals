package com.softserve.academy.module09inner;

public class Car {

    public class Model {

        private Model() {}

        public Color setMercedes() {
            model = "Mercedes";
            return new Color();
        }

        public Color setBMWx5() {
            model = "BMWx5";
            return new Color();
        }

        public Color setHonda() {
            model = "Honda";
            return new Color();
        }

        public Color setMazdaCX() {
            model = "MazdaCX";
            return new Color();
        }
    }

    // --------------------------------------------------------------------------------

    public class Color {

        private Color() {}

        public Engine setRed() {
            color = "Red";
            return new Engine();
        }

        public Engine setBlack() {
            color = "Black";
            return new Engine();
        }

        public Engine setWhite() {
            color = "White";
            return new Engine();
        }
    }

    // --------------------------------------------------------------------------------

    public class Engine {

        private Engine() {}

        public Gear setPetrol() {
            engine = "Petrol";
            return new Gear();
        }

        public Gear setDisel() {
            engine = "Disel";
            return new Gear();
        }
    }

    // --------------------------------------------------------------------------------

    public class Gear {

        private Gear() {}

        public Light setManual() {
            gear = "Manual";
            return new Light();
        }

        public Light setAutomat() {
            gear = "Automat";
            return new Light();
        }
    }

    // --------------------------------------------------------------------------------

    public class Light {

        private Light() {}

        public CarBuilder setHalogen() {
            light = "Halogen";
            return new CarBuilder();
        }

        public CarBuilder setXenon() {
            light = "Xenon";
            return new CarBuilder();
        }

        public CarBuilder setLed() {
            light = "Led";
            return new CarBuilder();
        }
    }

    // --------------------------------------------------------------------------------

    public class CarBuilder {

        private CarBuilder() {}

        public CarBuilder setBlackSalon() {
            salon = "BlackSalon";
            return this;
        }

        public CarBuilder setWhiteSalon() {
            salon = "WhiteSalon";
            return this;
        }

        public Car build() {
            return Car.this;
        }
    }

    // --------------------------------------------------------------------------------

    private String model;
    private String color;
    private String engine;
    private String gear;
    private String light;
    private String salon; // optional

    /*
    public Car(String model, String color, String engine, String gear, String light) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.gear = gear;
        this.light = light;
    }
    */

    //public Car() {
    private Car() {
        model = "";
        color = "";
        engine =  "";
        gear = "";
        light = "";
        salon = "default";
    }

    public static Model builder() {
        //return new Car();
        return new Car().new Model();
    }

    /* setters

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public Car setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public Car setGear(String gear) {
        this.gear = gear;
        return this;
    }

    public Car setLight(String light) {
        this.light = light;
        return this;
    }
    */

    // getters

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getGear() {
        return gear;
    }

    public String getLight() {
        return light;
    }

    public String getSalon() {
        return salon;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", gear='" + gear + '\'' +
                ", light='" + light + '\'' +
                ", salon='" + salon + '\'' +
                '}';
    }
} 