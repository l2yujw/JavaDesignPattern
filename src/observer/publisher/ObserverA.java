package observer.publisher;

public class ObserverA implements Observer{
    private boolean play;
    private Publisher publisher;

    public ObserverA(Publisher publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void notify(boolean play) {
        this.play = play;
        myActControl();
    }

    public void myActControl() {
        if (play) {
            System.out.println("MyClassA : 동작을 시작합니다.");
        } else {
            System.out.println("MyClassA : 동작을 정지합니다.");
        }
    }
}
