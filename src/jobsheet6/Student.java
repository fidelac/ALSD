package jobsheet6;

public class Student {
    String nim, name, studentClass;
    double gpa;

    public Student(){}

    public Student(String nm, String name, String clsNm, double gpa) {
        nim = nm;
        this.name = name;
        studentClass = clsNm;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println("NIM : " + nim + ", Name : " + name + ",Class : " + studentClass + ",GPA : " + gpa);
    }
}
