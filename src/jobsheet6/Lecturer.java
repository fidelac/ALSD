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
        System.out.printf("ID: %s, Name: %s, Gender: %s, Age: %4d\n",
                id,
                name,
                gender ? "Male" : "Female",
                age);
    }
}
