/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal5;
import java.util.ArrayList;
/**
 *
 * @author muhamad alfian bisri
 */
public class Tiket {
    private String kodeTiket;
    private String namaFilm;
    private String jenisTiket;
    private double hargaTiket;
    private int jumlahTiket;

    public Tiket(String kodeTiket, String namaFilm, String jenisTiket, double hargaTiket, int jumlahTiket) {
        this.kodeTiket = kodeTiket;
        this.namaFilm = namaFilm;
        this.jenisTiket = jenisTiket;
        this.hargaTiket = hargaTiket;
        this.jumlahTiket = jumlahTiket;
    }

    public double hitungTotal() {
        return hargaTiket * jumlahTiket;
    }

    public void tampilData() {
        System.out.println("=====================================");
        System.out.println("          DATA PEMESANAN TIKET       ");
        System.out.println("=====================================");
        System.out.println("Kode Tiket  : " + kodeTiket);
        System.out.println("Film        : " + namaFilm);
        System.out.println("Jenis Tiket : " + jenisTiket);
        System.out.println("Harga       : Rp " + (int) hargaTiket);
        System.out.println("Jumlah      : " + jumlahTiket);
        System.out.println("Total       : Rp " + (int) hitungTotal());
        System.out.println("-------------------------------------");
    }
}
