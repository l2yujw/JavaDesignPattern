package decorator.road;

public abstract class DisplayDecorator extends Display{
    private Display decoratorDisplay;

    public DisplayDecorator(Display decoratorDisplay) {
        this.decoratorDisplay = decoratorDisplay;
    }

    public void display(){
        decoratorDisplay.display();
    }
}
