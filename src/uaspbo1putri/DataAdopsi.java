package uaspbo1putri;

public class DataAdopsi {

    // Atribut dan Enkapsulasi
    private String tanggalAdopsi;

    // Constructor
    public DataAdopsi(String tanggalAdopsi) {
        this.tanggalAdopsi = tanggalAdopsi;
    }

    // Method
    public void tampilTanggal() {
        System.out.println("Tanggal Adopsi : " + tanggalAdopsi);
    }

}