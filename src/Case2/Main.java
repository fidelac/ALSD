package Case2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SingleLinkedList sll = new SingleLinkedList();
    Queue queue = new Queue(100);
    while (true) {
      System.out.println("-- Menu SPBU --");
      System.out.println("1. Tambah Antrian Kendaraan ");
      System.out.println("2. Tampilkan Antrian");
      System.out.println("3. Cek Jumlah Antrian Kendaraan");
      System.out.println("4. Layani Kendaraan ");
      System.out.println("5. Tampilkan Riwayat Transaksi");
      System.out.println("0. Keluar");
      System.out.print("Pilih menu:");
      int option = sc.nextInt();
      sc.nextLine();

      switch (option) {
        case 1:
          System.out.print("Masukkan Plat Nomor: ");
          String platNomor = sc.nextLine();
          System.out.print("Masukan Jenis Kendaraan: ");
          String tipe = sc.nextLine();
          System.out.print("Masukkan Merk Kendaraan: ");
          String merk = sc.nextLine();
          Kendaraan kd = new Kendaraan(platNomor, tipe, merk);
          sll.addLast(kd);
          System.out.println("Kendaraan masuk ke dalam antrian!");
          break;
        case 2:
          sll.print();
          break;
        case 3:
          System.out.println("Jumlah kendaraan dalam antrian: " + sll.size);
          break;
        case 4:
        if (sll.isEmpty()) {
          System.out.println("Antrian kosong!");
        }else{
          Kendaraan dilayani = sll.head.data;
          sll.removeFirst();
          System.out.println("Petugas melayani " +dilayani.platNomor);
          System.out.print("Masukkan jenis BBM: ");
          String namaBBM = sc.nextLine();
          System.out.print("Masukkan Harga Per Liter: ");
          double harga = sc.nextDouble();
          System.out.print("Masukkan Jumlah Liter: ");
          int liter = sc.nextInt();
          BBM  bbm = new BBM(namaBBM, harga);
          TransaksiPengisian transaksi = new TransaksiPengisian(dilayani, bbm, liter);
          transaksi.tampilkanTransaksi();
          queue.enqueue(transaksi);
          System.out.println("Transaksi berhasil dicatat.");
        }
          
          break;
        case 5 : 
          queue.print();
        break;
        case 0:
          System.out.println("Terima Kasih");
          return;
        default :
          System.out.println("Menu tidak valid!");
      }
    }
  }
}
