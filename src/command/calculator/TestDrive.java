package command.calculator;

public class TestDrive {

    public static void main(String[] args) {
        AddCalculator addCalculator = new AddCalculator();
        MinusCalculator minusCalculator = new MinusCalculator();

        Tester tester = new Tester();
        tester.addCommand(minusCalculator);
        tester.addCommand(addCalculator);

        double result1 = tester.execute(0, 1, 2);
        System.out.println(result1);
    }
}
