package module03.SmallestNumber;

public class SmallestNumber {
    double firstNumber;
    double secondNumber;
    double thirdNumber;

    public SmallestNumber(double firstNumber, double secondNumber, double thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getThirdNumber() {
        return thirdNumber;
    }

    public void setFirstNumbers(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setThirdNumber(double thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    public double minValue() {
        double min = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
        return min;
    }


}

