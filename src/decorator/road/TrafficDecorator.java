package decorator.road;

public class TrafficDecorator extends DisplayDecorator{
    public TrafficDecorator(Display decoratorDisplay) {
        super(decoratorDisplay);
    }

    public void display(){
        super.display();
        drawTraffic();
    }

    public void drawTraffic(){
        System.out.println("교통량 표시");
    }
}
