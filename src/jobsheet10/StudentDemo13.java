package jobsheet10;

import java.util.Scanner;

public class StudentDemo13 {
    public static void main(String[] args) {
        StudentAssignmentStack13 stack = new StudentAssignmentStack13(5);
        Scanner sc = new Scanner(System.in);

        int pilih;
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Pertama");
            System.out.println("6. Hitung Jumlah Tugas");
            System.out.print("Pilih");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String name = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String className = sc.nextLine();
                    Student13 std = new Student13(nim, name, className);
                    stack.push(std);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", std.name);
                    break;
                case 2:
                    Student13 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari" + dinilai.name);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.grading(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.name, nilai);

                        Attendance13 attendance = new Attendance13();
                        String binary = attendance.convertToBinary(nilai);
                        System.out.printf("Nilai biner dari %d adalah %s\n", nilai, binary);
                    }
                    break;
                case 3:
                    Student13 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Daftar semua tugas");
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.name);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKleas");
                    stack.print();
                    break;

                case 5:
                    Student13 first = stack.getFirst();
                    if (first != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + first.name);
                    } else {
                        System.out.println("Tidak ada tugas dalam daftar.");
                    }
                    break;

                case 6:
                    System.out.println("Jumlah tugas saat ini: " + stack.count());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");

            }
        } while (pilih >= 1 && pilih <= 4);

    }
}
