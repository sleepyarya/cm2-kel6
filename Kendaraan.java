public class Kendaraan {
    String noPol;
    String jenisKendaraan;
    String merk;

    public Kendaraan(String noPol, String jenisKendaraan, String merk) {
        this.noPol = noPol;
        this.jenisKendaraan = jenisKendaraan;
        this.merk = merk;
    }

    public void tampilkanInfo() {
        System.out.println("[" + noPol + "] " + jenisKendaraan + " - " + merk);
    }
}