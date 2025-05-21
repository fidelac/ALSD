package midterm;

public class student {
    String NIM, name, prodi;

    public student(String NIM, String name, String prodi) {
        this.NIM = NIM;
        this.name = name;
        this.prodi = prodi;
    }

    public void display() {
        System.out.println("NIM : " + NIM + " | Name : " + name + " | Prodi : " + prodi);
    }

}
