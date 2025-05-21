package jobsheet12;

public class StudentAssignment {
     String nim, name, studyProgram, className;

    public StudentAssignment(String nm, String nama, String studyProgram, String className) {
        this.nim = nm;
        this.name = nama;
        this.studyProgram = studyProgram;
        this.className = className;
    }

    public void print() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
        System.out.println("Study Program: " + studyProgram);
        System.out.println("Class: " + className);
    }
}
