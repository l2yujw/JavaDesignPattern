package strategy.Study;

public class Client {

    public static void main(String[] args) {
        Student mathFavoriteStudent = new MathBugStudent();
        mathFavoriteStudent.setStudy(new English());
        mathFavoriteStudent.display();
    }
}
