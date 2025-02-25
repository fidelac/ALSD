package jobsheet2;

public class Lecturer13 {
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    public Lecturer13() {
        this.lecturerID = "";
        this.name = "";
        this.status = false;
        this.startYear = 0;
        this.expertiseField = "";
    }

    public Lecturer13(String lecturerID, String name, boolean status, int startYear, String expertiseField) {
        this.lecturerID = lecturerID;
        this.name = name;
        this.status = status;
        this.startYear = startYear;
        this.expertiseField = expertiseField;
    }

    void print() {
        System.out.println("----------------------------------------------");
        System.out.println("Lecturer ID : " + lecturerID);
        System.out.println("Name : " + name);
        System.out.println("Status : " + (status ? "Active" : "Non-Active"));
        System.out.println("Start Year : " + startYear);
        System.out.println("Expertise Field : " + expertiseField);
    }

    void setStatus(boolean status) {
        this.status = status;
    }

    int calculateTenure(int yearNow){
        return yearNow - startYear;
    }

    void changeExpertiseField(String newExpertiseField){
        expertiseField = newExpertiseField;
    }
}
