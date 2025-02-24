package jobsheet2;

public class LecturerMain13 {
    public static void main(String[] args) {
        Lecturer13 lecturer1 = new Lecturer13();//(Using Default Constructor)   
        lecturer1.print();
        System.out.println();

        Lecturer13 lecturer2 = new Lecturer13("L134G4S", "Bagas", true, 2010, "Computer Science");//(Using Parameterized Constructor)
        lecturer2.print();
        System.out.println();

        lecturer2.setStatus(false);
        System.out.println("Updated Status: " + (lecturer2.status ? "Active" : "Inactive"));
        System.out.println("Tenure: " + lecturer2.calculateTenure(2025) + " years");
        lecturer2.changeExpertiseField("Algorithm and Data Structure");
        System.out.println("Updated Expertise Field: " + lecturer2.expertiseField);
    }
}
