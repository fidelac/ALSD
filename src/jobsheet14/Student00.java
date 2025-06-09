package jobsheet14;

public class Student00 {
    String nim, name, className;
    double ipk;

    public Student00(String nim, String name, String className, double ipk) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.ipk = ipk;
    }

    void print(){
        System.out.println(nim+" - "+name+" - "+className+" - "+ipk); 
    }
}
