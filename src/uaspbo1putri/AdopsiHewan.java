package uaspbo1putri;

public class AdopsiHewan {

    // Atribut dan enkapsulasi
    private String namaPengadopsi;
    private String namaHewan;
    private String jenisHewan;
    private int umur;

    // Constructor kosong
    public AdopsiHewan() {
    }

    // Constructor dengan parameter
    public AdopsiHewan(String namaPengadopsi,String namaHewan,String jenisHewan,int umur) {

        this.namaPengadopsi = namaPengadopsi;
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.umur = umur;
    }

    // mutator
    public void setNamaPengadopsi(String namaPengadopsi) {
        this.namaPengadopsi = namaPengadopsi;
    }

    public void setNamaHewan(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // accesor
    public String getNamaPengadopsi() {
        return namaPengadopsi;
    }

    public String getNamaHewan() {
        return namaHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public int getUmur() {
        return umur;
    }

    // method
    public String tampilData() {

        return "Nama Pengadopsi : " + namaPengadopsi
                + "\nNama Hewan : " + namaHewan
                + "\nJenis Hewan : " + jenisHewan
                + "\nUmur Hewan : " + umur + " Tahun";
    }

    // polymorphism (ovearloading)
    public String tampilData(boolean tampilStatus) {

        if (tampilStatus) {
            return tampilData()
                    + "\nStatus : Siap Diadopsi";
        }

        return tampilData();

    }

}