package strategy.Study;

public class MathBugStudent extends Student{
    @Override
    public void display() {
        System.out.println("수학 충입니다");
        study.study();
    }
}
