package state.wateringMachine;

public interface State {
    void coldWater();
    void hotWater();
    void normalWater();
    void waterSupply();
}
