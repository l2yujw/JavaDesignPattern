package strategy.Study;

public abstract class Student {
    Study study;

    public Student() {
    }

    public abstract void display();

    public void setStudy(Study study) {
        this.study = study;
    }
}
