package uaspbo1putri;

// Inheritance
public class Hewan extends AdopsiHewan {

    // Constructor
    public Hewan(String namaPengadopsi,
            String namaHewan,
            String jenisHewan,
            int umur) {

        //Constructor 
        super(namaPengadopsi,
                namaHewan,
                jenisHewan,
                umur);
    }

    // seleksi
    public String cekBiaya() {

        if (getUmur() <= 2) {
            return "Biaya Adopsi Rp100.000";
        } else {
            return "Biaya Adopsi Rp50.000";
        }

    }

    // polymorphism (overriding)
    @Override
    public String tampilData() {

        return super.tampilData()
                + "\n" + cekBiaya();

    }

}