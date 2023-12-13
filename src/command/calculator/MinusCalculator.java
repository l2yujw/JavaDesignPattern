package command.calculator;

public class MinusCalculator implements Command{
    @Override
    public double execute(double n1, double n2) {
        return n1 - n2;
    }
}
