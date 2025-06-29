package module03.AreaTriangle;

public class AreaTriangle {

    private double sideA;
    private double sideB;
    private double sideC;


    public AreaTriangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }


    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }


    public boolean triangleIsValid() {
        return sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA;
    }


    public double triangleCalculateArea() {
        double p = (sideA + sideB + sideC) / 2.0;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }


}


