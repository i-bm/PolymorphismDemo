package MehtodOverriding;

public class Multiplication implements Calculator{
private Double valueOne;
private Double valueTwo;

    public Multiplication(Double valueOne, Double valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Override
    public Double multiply() {
        return this.valueOne * valueTwo;
    }
}
