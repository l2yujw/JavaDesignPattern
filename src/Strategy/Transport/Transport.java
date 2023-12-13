package Strategy.Transport;

public class Transport {
    Movable movable;

    public Transport() {
    }

    public void performMove(){
        movable.move();
    }
    public void setMovable(Movable movable) {
        this.movable = movable;
    }
}
