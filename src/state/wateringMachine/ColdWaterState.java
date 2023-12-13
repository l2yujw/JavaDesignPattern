package state.wateringMachine;

public class ColdWaterState implements State {
    private final WaterMachine waterMachine;

    ColdWaterState(WaterMachine waterMachine) {
        this.waterMachine = waterMachine;
    }
    @Override
    public void coldWater() {
        System.out.println("이미 냉수가 선택되어 있습니다.");
    }

    @Override
    public void hotWater() {
        System.out.println("냉수 -> 온수로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.hotWaterState);
    }

    @Override
    public void normalWater() {
        System.out.println("냉수 -> 정수로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.normalWaterState);
    }

    @Override
    public void waterSupply() {
        System.out.println("냉수가 나옵니다.");
        WaterSupplier.supplyColdWater();
    }
}
