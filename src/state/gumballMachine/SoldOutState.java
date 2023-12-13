package state.gumballMachine;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
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
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
