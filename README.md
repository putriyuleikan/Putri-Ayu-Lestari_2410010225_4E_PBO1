# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana Sistem Adopsi Hewan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa tanggal adopsi, jumlah data adopsi, nama pengadopsi, nama hewan, jenis hewan, dan umur hewan. Selanjutnya aplikasi menampilkan informasi data hewan beserta biaya adopsi berdasarkan umur hewan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `AdopsiHewan`, `Hewan`, `DataAdopsi` dan `AdopsiHewanBeraksi` adalah contoh dari class.

```bash

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

package uaspbo1putri;

import java.util.Scanner;

public class AdopsiHewanBeraksi {

    public static void main(String[] args) {

        // IO
        Scanner input = new Scanner(System.in);

        System.out.print("Tanggal Adopsi : ");
        String tanggal = input.nextLine();

        // Object
        DataAdopsi data = new DataAdopsi(tanggal);

        System.out.print("Jumlah Data : ");
        int jumlah = Integer.parseInt(input.nextLine());

        // Array
        Hewan[] daftar = new Hewan[jumlah];

        // Perulangan
        for (int i = 0; i < daftar.length; i++) {

            System.out.println("\nData Hewan Ke-" + (i + 1));

            String namaPengadopsi = "";
            String namaHewan = "";
            String jenisHewan = "";
            int umur = 0;

            // Error Handling
            try {

                System.out.print("Nama Pengadopsi : ");
                namaPengadopsi = input.nextLine();

                System.out.print("Nama Hewan : ");
                namaHewan = input.nextLine();

                System.out.print("Jenis Hewan : ");
                jenisHewan = input.nextLine();

                System.out.print("Umur Hewan : ");
                umur = Integer.parseInt(input.nextLine());

            } catch (Exception e) {

                System.out.println("Error : " + e.getMessage());
                i--;
                continue;

            }

            // Object
            daftar[i] = new Hewan(
                    namaPengadopsi,
                    namaHewan,
                    jenisHewan,
                    umur);

        }

        System.out.println("\n==============================");
        System.out.println(" SISTEM ADOPSI HEWAN");
        System.out.println("==============================");

        data.tampilTanggal();

        // Perulangan
        for (Hewan h : daftar) {

            System.out.println("-----------------------------");
            System.out.println(h.tampilData());

        }

        input.close();

    }

}
```

2. **Object** adalah instance dari class. Pada kode ini, `DataAdopsi data = new DataAdopsi(tanggal);` adalah contoh pembuatan object.

```bash
DataAdopsi data = new DataAdopsi(tanggal);
```

3. **Atribut** adalah variabel yang ada dalam class `AdopsiHewan` dan `DataAdopsi`. Pada kode ini, `namaPengadopsi`,`namaHewan`,`jenisHewan`,`umur` dan `tanggalAdopsi` adalah contoh atribut.

```bash
    String namaPengadopsi;
    String namaHewan;
    String jenisHewan;
    int umur;

    String tanggalAdopsi;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `AdopsiHewan`, `Hewan` dan `DataAdopsi`.

```bash
    public AdopsiHewan() {
    }

    public AdopsiHewan(String namaPengadopsi,String namaHewan,String jenisHewan,int umur) {

        this.namaPengadopsi = namaPengadopsi;
        this.namaHewan = namaHewan;
        this.jenisHewan = jenisHewan;
        this.umur = umur;
    }

    public Hewan(String namaPengadopsi,
            String namaHewan,
            String jenisHewan,
            int umur) {

    super(namaPengadopsi,
                namaHewan,
                jenisHewan,
                umur);
    }

    public DataAdopsi(String tanggalAdopsi) {
        this.tanggalAdopsi = tanggalAdopsi;
    }

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPengadopsi`,`setNamaHewan`,`setJenisHewan` dan `setUmur` adalah contoh method mutator.

```bash
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
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPengadopsi`, `getNamaHewan`, `getJenisHewan` dan`getUmur` adalah contoh method accessor.

```bash
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
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaPengadopsi` `namaHewan`,`jenisHewan`,`umur` dan `tanggalAdopsi` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String namaPengadopsi;
    private String namaHewan;
    private String jenisHewan;
    private int umur;

    private String tanggalAdopsi;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Hewan` mewarisi `AdopsiHewan` dengan sintaks `extends`.

```bash
public class Hewan extends AdopsiHewan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilData(boolean tampilStatus)` di `AdopsiHewan` merupakan overloading method `tampilData` dan `tampilData` di `Hewan` merupakan override dari method `tampilData` di `AdopsiHewan`.

```bash
    public String tampilData(boolean tampilStatus) {

        if (tampilStatus) {
            return tampilData()
                    + "\nStatus : Siap Diadopsi";
        }

        return tampilData();

    @Override
    public String tampilData() {

        return super.tampilData()
                + "\n" + cekBiaya();

    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `cekBiaya` untuk menentukan biaya adopsi berdasarkan umur hewan. Jika umur hewan 2 tahun atau kurang, maka biaya adopsi adalah Rp100.000, sedangkan jika umur hewan lebih dari 2 tahun, maka biaya adopsinya adalah Rp50.000.

```bash
    public String cekBiaya() {

        if (getUmur() <= 2) {
            return "Biaya Adopsi Rp100.000";
        } else {
            return "Biaya Adopsi Rp50.000";
        }

    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
      for (int i = 0; i < daftar.length; i++) {

            System.out.println("\nData Hewan Ke-" + (i + 1));

            String namaPengadopsi = "";
            String namaHewan = "";
            String jenisHewan = "";
            int umur = 0;
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
        Scanner input = new Scanner(System.in);

        System.out.print("Tanggal Adopsi : ");
        String tanggal = input.nextLine();

	System.out.print("Nama Pengadopsi : ");
        namaPengadopsi = input.nextLine();

       	System.out.print("Nama Hewan : ");
        namaHewan = input.nextLine();

        System.out.print("Jenis Hewan : ");
        jenisHewan = input.nextLine();

       	System.out.print("Umur Hewan : ");
        umur = Integer.parseInt(input.nextLine());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Hewan[] daftar = new Hewan[jumlah];` adalah contoh penggunaan array.

```bash
Hewan[] daftar = new Hewan[jumlah];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try-catch` untuk menangani error.

```bash
	try {

      		System.out.print("Nama Pengadopsi : ");
      		namaPengadopsi = input.nextLine();

                System.out.print("Nama Hewan : ");
                namaHewan = input.nextLine();

                System.out.print("Jenis Hewan : ");
                jenisHewan = input.nextLine();

                System.out.print("Umur Hewan : ");
                umur = Integer.parseInt(input.nextLine());

         } catch (Exception e) {

                System.out.println("Error : " + e.getMessage());
                i--;
                continue;
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Putri Ayu Lestari
NPM: 2410010225
