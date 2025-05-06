package jobsheet10;

public class Attendance13 {
    public String convertToBinary(int grade) {
        String binary = "";
        while (grade != 0) { 
            binary = (grade % 2) + binary;
            grade = grade / 2;
        }
        return binary;
    }
}
