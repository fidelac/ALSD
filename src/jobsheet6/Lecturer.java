package jobsheet6;

public class Lecturer {
    String id, name;
    int age;
    Boolean gender;

    public Lecturer(String id, String name, Boolean gender , int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void print() {
        System.out.println("ID: " + id + ", Name: " + name + ", Gender: " + (gender ? "Male" : "Female" + ", Age:    " + age  ));

    }
}
