package jobsheet1;
import java.util.Scanner;

public class labs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mataKuliah = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobot = new double[mataKuliah.length];

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + " : ");
            nilaiAngka[i] = sc.nextDouble();
        }

        for (int i = 0; i < mataKuliah.length; i++) {
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobot[i] = 1;
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobot[i] = 0;
            }
        }

        System.out.println("====================================================================");
        System.out.println("\t\tHasil Konversi Nilai");
        System.out.println("====================================================================");
        System.out.printf(" %-30s         %-15s     %-15s     %-15s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        double totalBobot = 0.0;

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf(" %-30s         %-15.2f       %-15s      %-15.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);
            totalBobot += bobot[i];
            System.out.println();
        }

        double ip = totalBobot / mataKuliah.length;
        System.out.println("IP : " + ip);
        sc.close();
    }
}
