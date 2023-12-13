package state.WateringMachine;

public class WaterMachine {
    final State coldWaterState;
    final State hotWaterState;
    final State normalWaterState;
    final State childrenSafeState;

    // 현재 상태.
    private State currentState;

    public WaterMachine() {
        this.coldWaterState = new ColdWaterState(this);
        this.hotWaterState = new HotWaterState(this);
        this.normalWaterState = new NormalWaterState(this);
        this.childrenSafeState = new ChildrenSafeState(this);

        // 최초 상태는 정수 상태.
        this.currentState = this.normalWaterState;
    }

    void changeState(State nextState) {
        this.currentState = nextState;
    }

    // 냉온수가 사용자는 아래의 4개 메소드로 냉온수기를 이용한다.
    public void coldWater() {
        this.currentState.coldWater();
    }

    public void hotWater() {
        this.currentState.hotWater();
    }

    public void normalWater() {
        this.currentState.normalWater();
    }

    public void waterSupply() {
        this.currentState.waterSupply();
    }
}
