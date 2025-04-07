package jobsheet6;

import java.util.Scanner;

public class TopStudents13 {
    Student[] listStudents;
    int idx;

    public TopStudents13() {
        this.listStudents = new Student[10];
        this.idx = 0;
    }

    public void add(Student student) {
        if (idx < listStudents.length) {
            listStudents[idx] = student;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudents[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listStudents[j].gpa < listStudents[j + 1].gpa) {
                    Student temp = listStudents[j];
                    listStudents[j] = listStudents[j + 1];
                    listStudents[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(){
        for (int i = 0; i < idx - 1 ; i++){
            int minIndex = i;
            for(int j = i + 1; j < idx; j++){
                if (listStudents[j].gpa < listStudents[minIndex].gpa){
                    minIndex = j;
                }
            }
            Student temp = listStudents[minIndex];
            listStudents[minIndex] = listStudents[i];
            listStudents[i] = temp;
        }
    }

    public void insertionSort(){
        for (int i = 1; i < idx; i++){
            Student temp = listStudents[i];
            int j = i;

            while (j > 0 && listStudents[j - 1].gpa < temp.gpa){
                listStudents[j] = listStudents[j - 1];
                j = j - 1;
            }
            listStudents[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        TopStudents13 topStudents = new TopStudents13();

        topStudents.add(new Student("2201", "Alice", "A", 3.9));
        topStudents.add(new Student("2202", "Bob", "B", 3.7));
        topStudents.add(new Student("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student("2204", "David", "D", 3.6));
        topStudents.add(new Student("2205", "Eve", "E", 4.0));

        System.out.println("Original student list: ");
        topStudents.print();

        topStudents.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending): ");
        topStudents.print();

    }

}
