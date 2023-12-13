package templateMethod.teacher;

public class ClassRoom {

    public static void main(String[] args) {
        KoreanTeacher kr = new KoreanTeacher();
        MathTeacher math = new MathTeacher();
        EnglishTeacher engl = new EnglishTeacher();

        kr.startClass();
        System.out.println();
        math.startClass();
        System.out.println();
        engl.startClass();
    }
}
