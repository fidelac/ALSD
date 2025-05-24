package jobsheet13;

public class Student {
    String nim, name, className;
    Double gpa;

    public Student(){

    }
    
    public Student(String nim, String name, String className, Double gpa){
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }
    
    void print(){
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}
