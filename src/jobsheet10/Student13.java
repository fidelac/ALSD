package jobsheet10;

public class Student13 {
    String nim, name, className;
    int grade;

    public Student13(String nim, String name, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }

    void grading (int grade){
        this.grade = grade;
    }
    
}
