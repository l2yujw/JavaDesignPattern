package decorator.road;

public class LaneDecorator extends DisplayDecorator{
    public LaneDecorator(Display decoratorDisplay) {
        super(decoratorDisplay);
    }

    public void display(){
        super.display();
        drawLane();
    }

    public void drawLane() {
        System.out.println("차선 표시");
    }
}
