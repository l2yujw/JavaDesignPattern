package Proxy.GumballMachineMonitor;

public class GumballMachine {

    NoQuarterState noQuarterState;
    HasQuarterState hasQuarterState;
    SoldState soldState;
    SoldOutState soldOutState;
    WinnerState winnerState;
    State state;

    int count = 0;

    String location;

    public GumballMachine(String  location, int count) {

        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.count = count;
        if ( count > 0 ){
            state = noQuarterState;
        }

        this.location = location;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state = state;
    }

    void releaseBall(){
        System.out.println("볼이 나왔습니다");
        if (count != 0){
            count -= 1;
        }
    }

    void refill(int count){
        this.count = count;
        state = noQuarterState;
    }

    public int getCount() {
        return count;
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public SoldOutState getSoldOutState() {
        return soldOutState;
    }

    public WinnerState getWinnerState() {
        return winnerState;
    }

    public String getLocation() {
        return location;
    }

    public State getState() {
        return state;
    }
}
