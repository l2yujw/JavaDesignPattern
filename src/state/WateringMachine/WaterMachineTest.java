package state.WateringMachine;

public class WaterMachineTest {

    public static void main(String[] args) {
        WaterMachine waterMachine = new WaterMachine();

        waterMachine.waterSupply(); // 정수가 나옵니다.

        System.out.println();
        waterMachine.hotWater();  // 정수 -> 온수로 상태를 변경합니다.
        waterMachine.waterSupply(); // 뜨거운 물이 나옵니다. // 뜨거운 물이 나온 이후에는 안전을 위해 정수로 상태가 바뀝니다.

        System.out.println();
        waterMachine.coldWater(); // 정수 -> 냉수로 상태를 변경합니다.
        waterMachine.waterSupply(); // 냉수가 나옵니다.

        System.out.println();
        waterMachine.normalWater(); // 냉수 -> 정수로 상태를 변경합니다.

        System.out.println();
        waterMachine.normalWater(); // 정수 -> 안전 모드로 상태를 변경합니다.
        waterMachine.waterSupply(); // 정수가 나옵니다.
        waterMachine.hotWater();    // 안전 모드에서는 온수를 선택할 수 없습니다.
        waterMachine.waterSupply(); // 정수가 나옵니다.

        System.out.println();
        waterMachine.normalWater(); // 안전 모드 -> 정수로 상태를 변경합니다.
    }
}
