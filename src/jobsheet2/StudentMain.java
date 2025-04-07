package jobsheet2;
public class StudentMain {
   
    public static void main(String[] args) {
        Student13 student1 = new Student13("244107020097", "Tiara", "TI-1I", 3.8);
        student1.print();
        student1.changeClass("TI-2I");
        student1.updateGPA(3.9);
        student1.print();

        Student13 student2 = new Student13("244107020040", "Rizky", "TI-1I", 3.5);
        student2.updateGPA(3.3);
        student2.print();

        Student13 studentDaffa = new Student13 ("244107020098", "Daffa", "TI-1I", 3.7);
        studentDaffa.print();
        studentDaffa.changeClass("TI-2I");
        studentDaffa.updateGPA(3.8);    
        studentDaffa.print();

    }
    
    
    

}
        
    

    