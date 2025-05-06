package jobsheet10;

public class ExcuseLetter13 {
    String id, name, className;
    char typeOfExcuse;
    int duration;

    ExcuseLetter13(){

    }

    public ExcuseLetter13(String id, String name, String className, char typeOfExcuse, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = typeOfExcuse;
        this.duration = duration;
    }

    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Type of Excuse: " + typeOfExcuse);
        System.out.println("Duration: " + duration + " days");
    }
}
