package templateMethod.teacher;

public abstract class Teacher {

    public void startClass(){
        inside();
        attendence();
        teach();
        outside();
    }

    public void inside() {
        System.out.println("센세가 강의실로 들어옵니다.");
    }

    public void attendence() {
        System.out.println("선생님이 강의실을 나갑니다.");
    }

    public void outside() {
        System.out.println("선생님이 강의실을 나갑니다.");
    }

    abstract void teach();
}
