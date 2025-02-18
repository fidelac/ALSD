import java.util.Scanner;
public class labs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int assignmentGrade, quizGrade , gradeOfMidTerm, gradeOfFinalExam;

        System.out.println("Program to calculate final value");
        System.out.println("================================");
        System.out.print("Enter your assignment grade: ");
        assignmentGrade = sc.nextInt();
        System.out.print("Enter your quiz grade: ");
        quizGrade = sc.nextInt();
        System.out.print("Enter your grade of mid-term: ");
        gradeOfMidTerm = sc.nextInt();
        System.out.print("Enter your grade of final exam: ");
        gradeOfFinalExam = sc.nextInt();
      
        if ((assignmentGrade <= 0 ||assignmentGrade >= 100) || (quizGrade <= 0 || quizGrade >= 100) || (gradeOfMidTerm <= 0 || gradeOfMidTerm >= 100) || (gradeOfFinalExam <=0 || gradeOfFinalExam>=100)){
            System.out.println("================================");
            System.out.println("================================");
            System.out.println("Invalid value");
        } else {
            double finalGrade = (0.2 * assignmentGrade) + (0.2 * quizGrade) + (0.3 * gradeOfMidTerm) + (0.3 * gradeOfFinalExam);
            System.out.println("Final Grade: " + finalGrade);
            if (finalGrade > 80 && finalGrade <= 100) {
                System.out.println("Final Latter Grade: A");
            } else if (finalGrade > 73 && finalGrade <= 80) {
                 System.out.println("Final Latter Grade: B+");
            } else if (finalGrade > 65 && finalGrade <= 73) {
                 System.out.println("Final Latter Grade : B ");
            } else if (finalGrade > 60 && finalGrade <= 65) {
                 System.out.println("Final Latter Grade : C+");
            } else if (finalGrade > 50 && finalGrade <= 60) {
                System.out.println("Final Latter Grade: C");
            } else if (finalGrade > 39 && finalGrade <= 50) {
                System.out.println("Final Latter Grade: D ");
            } else if (finalGrade <= 39) {
                System.out.println("Final Latter Grade: E ");
            }
             if (finalGrade > 39) {
                System.out.println("=======================");
                System.out.println("=======================");
                System.out.println("CONGRATULATIONS, YOU PASSED");
            } else {
                System.out.println("=======================");
                System.out.println("=======================");
                System.out.println("YOU FAILED. BETTER LUCK NEXT TIME!");
        }
         
      sc.close();
     }
    
    }
}