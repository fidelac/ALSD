package Case2;

public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter, totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter){
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
    }

    public void tampilkanTransaksi(){
        System.out.println("Plat Nomor: " + kendaraan.platNomor);
        System.out.println("Jenis BBM: " + bbm.namaBBM);
        System.out.println("Jumlah Liter: " + liter);
        System.out.println("Harga per Liter: Rp " + bbm.hargaPerLiter);
        System.out.println("Total Bayar: Rp " + totalBayar());
    }

    public double totalBayar(){
        double total = bbm.hargaPerLiter * liter;
        System.out.println(kendaraan.platNomor + ": Rp " + total);
        return total;
    }
}
