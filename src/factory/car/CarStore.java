package factory.car;

public abstract class CarStore {

    DoorProduct doorProduct;
    TireProduct tireProduct;
    CarFactory carFactory;

    public void makeParts(){
        doorProduct =  carFactory.createDoor();
        tireProduct = carFactory.createTire();

    }
    public void makeCar(){
        makeParts();
        doorProduct.makeAssemble();
        tireProduct.makeAssemble();
    }
    public abstract void display();
}
