package command.calculator;

public class AddCalculator implements Command{
    @Override
    public double execute(double n1, double n2) {
        return n1 + n2;
    }
}
