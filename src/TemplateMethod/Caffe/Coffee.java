package TemplateMethod.Caffe;

public class Coffee extends CaffeineBeverage{


    @Override
    protected void brew() {
        System.out.println("필터로 커피 우리기");
    }

    @Override
    protected void addCondiments() {
        System.out.println("설탕 우유 추가");
    }
}
