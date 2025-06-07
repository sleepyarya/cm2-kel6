public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = liter * bbm.hargaPerLiter;
    }

    public void tampilkanTransaksi() {
        System.out.println("Plat Nomor : " + kendaraan.platNomor);
        System.out.println("Jenis BBM  : " + bbm.namaBBM);
        System.out.println("Jumlah Liter: " + liter);
        System.out.println("Harga/Liter: " + bbm.hargaPerLiter);
        System.out.println("Total Bayar: Rp " + totalBayar);
    }
}
