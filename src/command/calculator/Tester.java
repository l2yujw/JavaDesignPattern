package command.calculator;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public double execute(int index, double n1, double n2) {
        return commandList.get(index).execute(n1, n2);
    }
}
