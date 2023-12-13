package iterator.studyGroup;

public class User {
    private String name;
    private int age;
    private String loginId;

    public User(String name, int age, String loginId) {
        this.name = name;
        this.age = age;
        this.loginId = loginId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLoginId() {
        return loginId;
    }
}
