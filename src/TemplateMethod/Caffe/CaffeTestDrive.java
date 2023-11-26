package TemplateMethod.Caffe;

public class CaffeTestDrive {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        Tea tea = new Tea();
        System.out.println();
        tea.prepareRecipe();

        TeaWithHook teaHook = new TeaWithHook();
        System.out.println();
        teaHook.prepareRecipe();

        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        System.out.println();
        coffeeHook.prepareRecipe();
    }
}
