package jobsheet2;
public class StudentMain {
   
    public static void main(String[] args) {
        Student13 student1 = new Student13();
        student1.studentID = "244107020046";
        student1.name = "Fidela Clarisa";
        student1.className = "TI-1I";
        student1.gpa =3.4;
        student1.print();
        student1.changeClass("TI-2I");
        student1.updateGPA(3.9);
        student1.print();
        Student13 student2 = new Student13("244107020040", "Rizky", "TI-1I", 3.5);
        student2.updateGPA(9);
        student2.print();

    }
    
    
    

}
        
    

    