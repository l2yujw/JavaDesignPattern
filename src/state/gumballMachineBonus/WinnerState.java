package state.gumballMachineBonus;

public class WinnerState implements State{
    GumballMachineBonus gumballMachineBonus;

    public WinnerState(GumballMachineBonus gumballMachineBonus) {
        this.gumballMachineBonus = gumballMachineBonus;
    }

    @Override
    public void insertQuarter() {
        System.out.println("이미 줌");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 줌");
    }

    @Override
    public void turnCrank() {
        System.out.println("이미 줌");
    }

    @Override
    public void dispense() {
        gumballMachineBonus.releaseBall();
        if(gumballMachineBonus.getCount() == 0){
            gumballMachineBonus.setState(gumballMachineBonus.getSoldOutState());
        } else {
            gumballMachineBonus.releaseBall();
            System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
            if (gumballMachineBonus.getCount() > 0) {
                gumballMachineBonus.setState(gumballMachineBonus.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachineBonus.setState(gumballMachineBonus.getSoldOutState());
            }
        }
    }

    @Override
    public void refill() {

    }
}
