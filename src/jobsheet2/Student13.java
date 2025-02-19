package jobsheet2;

public class Student13 {
    String studentID;
    String name;
    String className;
    double gpa;

    public Student13() {
        
    }

    public Student13(String id, String name, String cls, double gpa) {
        studentID = id;
        this.name = name;
        className = cls;
        this.gpa = gpa;
    }


    void print() {
        System.out.println("Student ID : " + studentID);
        System.out.println("Name : " + name);
        System.out.println("Class : " + className);
        System.out.println("GPA : " + gpa);
    }

    void changeClass(String newClass) {
        className = newClass;
    }

    void updateGPA(double newGPA) {
        if (gpa >= 0.0 && gpa <= 4.0) {
             gpa = newGPA;
            }else{    System.out.println("Invalid IPK. Must be between 0.0 and 4.0");
        }
    }

    String evaluate() {
        if (gpa >= 3.5) {
            return "Excellent";
        } else if (gpa >= 3.0) {
            return "Good";
        } else if (gpa >= 2.5) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}