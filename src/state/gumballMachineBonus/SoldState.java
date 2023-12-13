package state.gumballMachineBonus;

public class SoldState implements State {
    GumballMachineBonus gumballMachineBonus;

    public SoldState(GumballMachineBonus gumballMachine) {
        this.gumballMachineBonus = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 뽑으셨습니다");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한번만 돌려주세요");
    }

    @Override
    public void dispense() {
        gumballMachineBonus.releaseBall();
        if (gumballMachineBonus.getCount() > 0){
            gumballMachineBonus.setState(gumballMachineBonus.getNoQuarterState());
        } else {
            gumballMachineBonus.setState(gumballMachineBonus.getSoldState());
        }
    }

    @Override
    public void refill() {

    }
}
