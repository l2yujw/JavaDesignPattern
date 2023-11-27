package Proxy.GumballMachineMonitor;

public class SoldOutState implements State{
    private static final long serialVersionUID = 2L;

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
}
