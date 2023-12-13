package state.wateringMachine;

public class NormalWaterState implements State{
    private final WaterMachine waterMachine;

    NormalWaterState(WaterMachine waterMachine) {
        this.waterMachine = waterMachine;
    }
    @Override
    public void coldWater() {
        System.out.println("정수 -> 냉수로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.coldWaterState);
    }

    @Override
    public void hotWater() {
        System.out.println("정수 -> 온수로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.hotWaterState);
    }

    @Override
    public void normalWater() {
        System.out.println("정수 -> 안전 모드로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.childrenSafeState);
    }

    @Override
    public void waterSupply() {
        System.out.println("정수가 나옵니다.");
        WaterSupplier.supplyNormalWater();
    }
}
