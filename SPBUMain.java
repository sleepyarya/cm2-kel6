import java.util.Scanner;

public class SPBUMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLinkedList antrian = new AntrianLinkedList();
        QueueTransaksi transaksi = new QueueTransaksi(100);

        while (true) {
            System.out.println("========== MENU SPBU ==========");
            System.out.println("1. Tambah Kendaraan ke Antrian");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Jumlah Kendaraan dalam Antrian");
            System.out.println("4. Layani Kendaraan dan Catat Transaksi");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print(">> Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine(); // flush newline

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor   : ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk Kendaraan: ");
                    String merk = sc.nextLine();
                    Kendaraan k = new Kendaraan(plat, tipe, merk);
                    antrian.tambahAntrian(k);
                    break;

                case 2:
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    System.out.println(">> Jumlah Kendaraan dalam Antrian: " + antrian.jumlahAntrian());
                    break;

                case 4:
                    Kendaraan dilayani = antrian.layaniAntrian();
                    if (dilayani != null) {
                    System.out.println("Petugas melayani " + dilayani.platNomor);
                    System.out.print("Masukkan Jenis BBM: ");
                    String jenisBBM = sc.nextLine();
                    System.out.print("Masukkan Harga per liter: ");
                    double harga = sc.nextDouble();
                    System.out.print("Masukkan Jumlah liter: ");
                    double liter = sc.nextDouble();
                    sc.nextLine(); // flush newline

                    BBM bbm = new BBM(jenisBBM, harga);
                    TransaksiPengisian t = new TransaksiPengisian(dilayani, bbm, liter);
                    transaksi.enqueue(t);
                }
                break;

                case 5:
                    transaksi.tampilkanRiwayat();
                    break;

                case 0:
                    System.out.println(">> Program selesai. Terima kasih!");
                    return;

                default:
                    System.out.println(">> Menu tidak valid!");
            }

            System.out.println();
        }
    }
}
