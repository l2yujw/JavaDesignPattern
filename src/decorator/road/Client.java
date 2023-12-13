package decorator.road;

public class Client {

    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.display(); // 기본 도로 표시

        System.out.println();
        Display roadWithLane = new LaneDecorator(road);
        roadWithLane.display(); // 기본 도로 + 차선 표시

        Display road2 = new RoadDisplay();
        System.out.println();
        road2 = new TrafficDecorator(road2);
        road2.display(); // 기본 도로 + 교통량 표시

        System.out.println();
        Display roadWithLaneAndTraffic =
                new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
        roadWithLaneAndTraffic.display();
    }
}
