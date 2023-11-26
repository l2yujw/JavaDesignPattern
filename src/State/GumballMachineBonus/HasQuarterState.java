package State.GumballMachineBonus;

import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachineBonus gumballMachineBonus;

    public HasQuarterState(GumballMachineBonus gumballMachine) {
        this.gumballMachineBonus = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전은 한 개만 넣어주세요");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전이 반환됩니다");
        gumballMachineBonus.setState(gumballMachineBonus.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachineBonus.getCount() > 1)) {
            gumballMachineBonus.setState(gumballMachineBonus.getWinnerState());
        } else {
            gumballMachineBonus.setState(gumballMachineBonus.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }

    @Override
    public void refill() {

    }
}
