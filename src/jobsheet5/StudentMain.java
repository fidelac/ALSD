package jobsheet5;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Ahmad" , "2201010001", 2022, 78, 82),
            new Student("Budi", "2201010002", 2022, 85, 88),
            new Student("Cindy", "2201010003", 2022, 90, 87),
            new Student("Dian", "2201010004", 2021, 76, 79),
            new Student("Eko", "2201010005", 2023, 92, 95),
            new Student("Fajar", "2201010006", 2020, 88, 85),
            new Student("Gina", "2201010007", 2023, 80, 83),
            new Student("Hadi", "2201010008", 2020, 82, 84),
        };

        int maxUTS = Student.findMaxUTS(students, 0, students.length - 1);
        int minUTS = Student.findMinUTS(students, 0, students.length - 1);
        double avgUAS = Student.calculateAverageUAS(students);

        // Menampilkan hasil
        System.out.println("Highest Midterm Score (UTS) : " + maxUTS);
        System.out.println("Lowest Midterm Score (UTS)  : " + minUTS);
        System.out.println("Average Final Score (UAS)   : " + avgUAS);
    

    }
}
