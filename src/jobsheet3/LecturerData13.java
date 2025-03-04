package jobsheet3;

public class LecturerData13 {
    static void showAllLecturerData(Lecturer13[] lecturerArray) {
        for (Lecturer13 lecturer : lecturerArray) {
            if (lecturer != null) { // Add this check to avoid null pointer exception
                System.out.println("ID: " + lecturer.id);
                System.out.println("Name: " + lecturer.name);
                System.out.println("Gender: " + (lecturer.gender ? "Male" : "Female"));
                System.out.println("Age: " + lecturer.age);
                System.out.println();
            } else {
                System.out.println("Invalid lecturer data encountered.");
            }
        }
    }

    static void countLecturerByGender(Lecturer13[] lecturerArray) {
        int maleCount = 0;
        int femaleCount = 0;
        for (Lecturer13 lecturer : lecturerArray){
            if (lecturer.gender) {
                maleCount++;
            }else{
                femaleCount++;
            }
        }
        System.out.println("Number of Male Lecturer: " + maleCount);
        System.out.println("Number of Female Lecturer: " + femaleCount);
    }

    static void averageLecturerAgeByGender(Lecturer13[] lecturerArray) {
        int maleCount = 0;
        int femaleCount = 0;
        int maleAge = 0;
        int femaleAge = 0;
        for(Lecturer13 lecturer : lecturerArray){
            if(lecturer.gender){
                maleCount++;
                maleAge += lecturer.age;
            }else{
                femaleCount++;
                femaleAge += lecturer.age;
            }
        }
        System.out.println("Average Age of Male Lecturer: " + (maleCount == 0 ? 0 : maleAge / maleCount));
        System.out.println("Average Age of Female Lecturer: " + (femaleCount == 0 ? 0 : femaleAge / femaleCount));
    }

    static void showOldestLecturerInfo(Lecturer13[] lecturerArray) {
        Lecturer13 oldest = lecturerArray[0];
        for (Lecturer13 lecturer : lecturerArray) {
            if (lecturer.age > oldest.age) {
                oldest = lecturer;
            }
        }
        System.out.println("Oldest Lecturer Info: ");
        System.out.println("Lecturer ID: " + oldest.id + ", Name: " + oldest.name + ", Gender: " + (oldest.gender ? "Male" : "Female") + ", Age: " + oldest.age);
    }

    static void showYoungestLecturerInfo(Lecturer13[] lecturerArray) {
        Lecturer13 youngest = lecturerArray[0];
        for (Lecturer13 lecturer : lecturerArray) {
            if (lecturer.age < youngest.age) {
                youngest = lecturer;
            }
        }
        System.out.println("Youngest Lecturer Info: ");
        System.out.println("Lecturer ID: " + youngest.id + ", Name: " + youngest.name + ", Gender: " + (youngest.gender? "Male" : "Female") + ", Age: " + youngest.age );
    }
}
