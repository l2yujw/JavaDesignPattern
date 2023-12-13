package strategy.Study;

public class EnglishBugStudent extends Student{
    @Override
    public void display() {
        System.out.println("영어 하나는 잘합니다.");
        study.study();
    }
}
