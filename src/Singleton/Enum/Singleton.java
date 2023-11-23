package Singleton.Enum;

public enum Singleton {
    UNIQUE_INSTANCE, UNIQUE_INSTANCE2;

    private boolean check = true;

    public String getDescription(){
        check = !check;
        System.out.println(check);
        return "ThreadSingleton";
    }
}
