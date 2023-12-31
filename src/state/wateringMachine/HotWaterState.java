package state.wateringMachine;

public class HotWaterState implements State {

    private final WaterMachine waterMachine;

    HotWaterState(WaterMachine waterMachine) {
        this.waterMachine = waterMachine;
    }
    @Override
    public void coldWater() {
        System.out.println("온수 -> 냉수로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.coldWaterState);
    }

    @Override
    public void hotWater() {
        System.out.println("이미 온수가 선택되어 있습니다.");

    }

    @Override
    public void normalWater() {
        System.out.println("온수 -> 정수로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.normalWaterState);
    }

    @Override
    public void waterSupply() {
        System.out.println("뜨거운 물이 나옵니다.");
        WaterSupplier.supplyHotWater();
        System.out.println("뜨거운 물이 나온 이후에는 안전을 위해 정수로 상태가 바뀝니다.");
        waterMachine.changeState(waterMachine.normalWaterState);
    }
}
