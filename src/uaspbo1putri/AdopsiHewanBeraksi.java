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