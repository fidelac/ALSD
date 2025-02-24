package jobsheet2;

public class Course13 {
    String courseID;
    String name;
    int credit;
    int hour;

    public Course13(String id, String name, int SKS, int hour) {
        courseID = id;
        this.name = name;
        credit = SKS;
        this.hour = hour;
    }

    public Course13() {
        courseID = "";
        name = "";
        credit = 0;
        hour = 0;
    }


    void print(){
        System.out.println("Course ID : " + courseID);
        System.out.println("Name : " + name);
        System.out.println("Credit : " + credit);
        System.out.println("Hour : " + hour);
    }

    void changeCredit(int newCredit){
        credit = newCredit;
    }

    void addHour(int hour){
        this.hour += hour;
    }

    void reduceHour(int hour){
        if (this.hour - hour < 0){
            System.out.println("Invalid hour. Must be greater than 0");
        } else {
            this.hour -= hour;
        }
    }


}
