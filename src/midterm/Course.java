package midterm;

public class Course {
    String courseCode, courseName;
    int sks;

    public Course(String courseCode, String courseName, int sks) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.sks = sks;
    }

    public void displayCourse() {
        System.out.println("Course Code : " + courseCode + " | Course Name : " + courseName + " | SKS : " + sks);

    }

}