package templateMethod.caffe;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    private void boilWater(){
        System.out.println("물 보글");
    }
    private void pourInCup(){
        System.out.println("컵 주르륵");
    }
}
