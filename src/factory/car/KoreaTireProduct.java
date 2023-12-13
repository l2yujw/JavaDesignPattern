package factory.car;

public class KoreaTireProduct extends TireProduct{

        @Override
        public void makeAssemble() {
                System.out.println("국산타이어");
        }
}
