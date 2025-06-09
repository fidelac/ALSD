package Case2;

public class Queue {
  TransaksiPengisian[] queue;
  int front, rear, size, max;

  public Queue(int n) {
    max = n;
    queue = new TransaksiPengisian[max];
    size = 0;
    front = rear = -1;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isFull() {
    if (size == max) {
      return true;
    } else {
      return false;
    }
  }

  public void print() {
    if (!isEmpty()) {
      System.out.println("Riwayat Transaksi:");
      int i = front; //variabel penunjuk indeksny
      do { //pengulangan untuk menelusuri semua elemen antrian dari front sampai rear
        queue[i].tampilkanTransaksi();
        System.out.println("----------------------");
        i = (i + 1) % max; //majuin indeks ke elemen berikutnya/meajuin index setelahny ke depan
      } while (i != (rear + 1) % max); 
      System.out.println("Jumlah Transaksi: " + size);
    } else {
      System.out.println("Queue is empty!!");
    }
  }

  public void enqueue(TransaksiPengisian dt) {
    if (!isFull()) {
      if (isEmpty()) {
        front = rear = 0;
      } else {
        if (rear == max - 1) {
          rear = 0;
        } else {
          rear++;
        }
      }
      queue[rear] = dt;
      size++;
      System.out.println("Transaksi berhasil dimasukkan ke antrian di index " + rear);
    } else {
      System.out.println("Queue is full!!");
    }
  }
}
