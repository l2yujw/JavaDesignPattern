package strategy.transport2;

public class Moving {
    private  Road road;

    public void move(){
        road.move();
    }

    public void setRoad(Road road) {
        this.road = road;
    }
}
