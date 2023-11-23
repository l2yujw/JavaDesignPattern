package Singleton.Enum;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        Singleton singleton1 = Singleton.UNIQUE_INSTANCE2;
        System.out.println(singleton.getDescription());
        System.out.println(singleton.getDescription());
        System.out.println(singleton.getDescription());

        System.out.println();
        System.out.println(singleton1.getDescription());
    }
}
