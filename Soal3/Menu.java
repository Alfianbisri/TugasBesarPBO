/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal3;

/**
 *
 * @author muhamad alfian bisri
 */
public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    // Constructor tanpa parameter (Overloading)
    public Menu() {
        this.kodeMenu = "";
        this.namaMenu = "";
        this.harga = 0.0;
        this.kategori = "";
    }

    // Constructor dengan parameter
    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public double hitungHarga(int jml) {
        return harga * jml;
    }

    public void tampilMenu(int jumlahPesanan) {
        System.out.println("=== SOAL 3: SISTEM KAFE ===");
        System.out.println("Kode   : " + kodeMenu);
        System.out.println("Nama   : " + namaMenu);
        System.out.println("Harga  : " + (int) harga);
        System.out.println("Jumlah : " + jumlahPesanan + " (Parameter input)");
        System.out.println("Total  : " + (int) hitungHarga(jumlahPesanan) + " (Return calculation)");
        System.out.println("----------------------------------------\n");
    }
}

