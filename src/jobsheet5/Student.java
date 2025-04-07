package jobsheet5;

public class Student {
    String name, studentID;
    int yearOfAdmission, midtermScore, finalScore;

    public Student(String name, String studentID, int yearOfAdmission, int midtermScore, int finalScore){
        this.name = name;
        this.studentID = studentID;
        this.yearOfAdmission = yearOfAdmission;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public static int  findMaxUTS(Student[] students, int left, int right){
        if(left == right){
            return students[left].midtermScore;
        }
        int mid = (left + right) / 2;
        int lmax = findMaxUTS(students, left, mid);
        int rmax = findMaxUTS(students, mid+1, right);
        return Math.max(lmax, rmax);
    } 

    public static int findMinUTS(Student[] students, int left, int right){
        if(left == right){
            return students[left].midtermScore;
        }
        int mid = (left + right) / 2;
        int lmin = findMinUTS(students, left, mid);
        int rmin = findMinUTS(students, mid+1, right);
        return Math.min(lmin, rmin);
    }

    public static double calculateAverageUAS(Student[] students){
        int total = 0;
        for(Student student : students){
            total += student.finalScore;
        }
        return (double) total / students.length;
    }
}
