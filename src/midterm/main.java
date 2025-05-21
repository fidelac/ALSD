package midterm;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student[] students = new student[3];
        students[0] = new student("22001", "Ali Rahman", "Sistem Informasi Bisnis");
        students[1] = new student("22002", "Budi Sasonto", "Manajemen Informatika");
        students[2] = new student("22003", "Citra Dewi", "Teknik Informatika");

        Course[] crs = new Course[3];
        crs[0] = new Course("MK001", "Struktur Data", 3);
        crs[1] = new Course("MK002", "Basis Data", 2);
        crs[2] = new Course("MK003", "Desain Web", 3);

        penilaian[] nilai = {
                new penilaian(students[0], crs[0], 80, 85, 90),
                new penilaian(students[0], crs[1], 60, 75, 70),
                new penilaian(students[1], crs[0], 75, 70, 80),
                new penilaian(students[2], crs[1], 85, 90, 95),
                new penilaian(students[2], crs[2], 80, 90, 65),
        };

        for (penilaian p : nilai) {
            p.hitungNilaiAkhir();
        }

        while (true) {
            System.out.println("MENU: ");
            System.out.println("1. Show Student List ");
            System.out.println("2. Show Courses List");
            System.out.println("3. Show Assessment Data");
            System.out.println("4. Sort Students Based on Final Score");
            System.out.println("5. Search For Students By NIM");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    for (int i = 0; i < students.length; i++) {
                        students[i].display();
                    }

                    break;
                case 2:
                    for (int i = 0; i < crs.length; i++) {
                        crs[i].displayCourse();
                    }

                    break;
                case 3:
                    penilaian.tampilPenilaian(nilai);
                    break;
                case 4:
                    urutkanMahasiswaNilai(nilai);
                    break;
                case 5:
                    System.out.print("Input student NIM: ");
                    String nim = sc.nextLine();
                    seqSearch(nim, nilai);
                    break;
                case 0:
                    System.out.println("Thank you for choosing our program");
                    return;
                default:
                    System.out.println("Invalid option");

                    break;
            }
        }
    }

    public static void urutkanMahasiswaNilai(penilaian[] nilai) {
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - i - 1; j++) {
                if (nilai[j].nilaiAkhir < nilai[j + 1].nilaiAkhir) {
                    penilaian temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        System.out.println("Daftar Mahasiswa setelah diurutkan berdasarkan nilai akhir:");
        for (penilaian p : nilai) {
            System.out.println("Mahasiswa: " + p.Student.name +
                    " | Matkul: " + p.course.courseName +
                    " | Nilai Akhir: " + p.nilaiAkhir);
        }
    }

    public static int seqSearch(String search, penilaian[] nilai) {
        System.out.print("Hasil Pencarian Penilaian");
        boolean found = false;

        for (penilaian p : nilai) {
            if (p.Student.NIM.equalsIgnoreCase(search)) {
                System.out.println("Name: " + p.Student.name);
                System.out.println("Course: " + p.course.courseName);
                System.out.println("Assignment Score: " + p.nilaiTugas);
                System.out.println("Midterm Score: " + p.nilaiUts);
                System.out.println("Final exam Score: " + p.nilaiUas);
                System.out.println("Final Score: " + p.nilaiAkhir);
                found = true;
            }

        }
        if (!found) {
            System.out.println("Student not found");
        }
        return -1;
    }
}