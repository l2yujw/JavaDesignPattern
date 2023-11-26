package State.GumballMachineBonus;

public class NoQuarterState implements State {

    GumballMachineBonus gumballMachineBonus;

    public NoQuarterState(GumballMachineBonus gumballMachine) {
        this.gumballMachineBonus = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다");
        gumballMachineBonus.setState(gumballMachineBonus.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void refill() {

    }
}
