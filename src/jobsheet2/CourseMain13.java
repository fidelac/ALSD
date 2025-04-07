package jobsheet2;

public class CourseMain13 {
    public static void main(String[] args) {
        Course13 course1 = new Course13();
        System.out.println("Course 1 :" );//(Using Default Constructor)
        course1.print();
        System.out.println();

        Course13 course2 = new Course13("CS101", "Algorithm And Structur Data", 3, 4);
        System.out.println("Course 2 :");//(Using Parameterized Constructor)
        course2.print();
        System.out.println();

        course2.changeCredit(4);
        course2.addHour(2);
        course2.reduceHour(1);
        System.out.println();

        course1.changeCredit(3);
        course1.addHour(3);
        course1.reduceHour(1);
    }
}
