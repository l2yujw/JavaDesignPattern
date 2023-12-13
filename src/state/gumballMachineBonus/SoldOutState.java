package state.gumballMachineBonus;

public class SoldOutState implements State {
    GumballMachineBonus gumballMachineBonus;

    public SoldOutState(GumballMachineBonus gumballMachine) {
        this.gumballMachineBonus = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진됐습니다");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("매진됐습니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진됐다니까요");
    }

    @Override
    public void dispense() {
        System.out.println("No");
    }

    @Override
    public void refill() {
        System.out.println("리필");
        gumballMachineBonus.setState(gumballMachineBonus.getNoQuarterState());
    }
}
