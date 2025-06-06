public class Kendaraan {
    String platNomor;
    String jenisKendaraan;
    String merk;

    public Kendaraan(String platNomor, String jenisKendaraan, String merk) {
        this.platNomor = platNomor;
        this.jenisKendaraan = jenisKendaraan;
        this.merk = merk;
    }

    public void tampilkanInformasi() {
        System.out.println("- " + platNomor + " (" + jenisKendaraan + ", " + merk + ")");
    }
}