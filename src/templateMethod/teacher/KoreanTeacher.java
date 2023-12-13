package templateMethod.teacher;

public class KoreanTeacher extends Teacher {
    @Override
    void teach() {
        System.out.println("선생님이 국어를 수업합니다.");
    }
}
