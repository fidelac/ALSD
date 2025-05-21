package midterm;

public class penilaian {
  student Student;
  Course course;
  double nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

  public penilaian(student Student, Course course, double tugas, double uts, double uas) {
    this.Student = Student;
    this.course = course;
    nilaiTugas = tugas;
    nilaiUts = uts;
    nilaiUas = uas;
  }

  public void hitungNilaiAkhir() {
    this.nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUts * 0.3) + (nilaiUas * 0.4);
  }

  public static void tampilPenilaian(penilaian[] nilai) {
    for (penilaian p : nilai) {
      System.out.println("NIM: " + p.Student.NIM);
      System.out.println("Nama: " + p.Student.name);
      System.out.println("Mata Kuliah: " + p.course.courseName);
      System.out.println("Tugas: " + p.nilaiTugas);
      System.out.println("UTS: " + p.nilaiUts);
      System.out.println("UAS: " + p.nilaiUas);
      System.out.println("Nilai Akhir: " + p.nilaiAkhir);

    }
  }
}
