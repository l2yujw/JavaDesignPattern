package state.WateringMachine;

public class ChildrenSafeState implements State{
    private final WaterMachine waterMachine;

    ChildrenSafeState(WaterMachine waterMachine) {
        this.waterMachine = waterMachine;
    }
    @Override
    public void coldWater() {
        System.out.println("안전 모드에서는 냉수를 선택할 수 없습니다.");

    }

    @Override
    public void hotWater() {
        System.out.println("안전 모드에서는 온수를 선택할 수 없습니다.");

    }

    @Override
    public void normalWater() {
        System.out.println("안전 모드 -> 정수로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.normalWaterState);
    }

    @Override
    public void waterSupply() {
        System.out.println("정수가 나옵니다.");
        WaterSupplier.supplyNormalWater();
    }
}
