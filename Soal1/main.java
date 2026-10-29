/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author muhamad alfian bisri
 */
public class main {
    public static void main(String[] args) {
        System.out.println("=== SOAL 1: SISTEM INVENTARIS BUKU ===");
        Buku buku1 = new Buku("BK-001", "Pemrograman Berorientasi Objek", "Alfian", 125000);
        Buku buku2 = new Buku("BK-002", "Pemrograman WEb Dasar", "Bisri", 95000);

        buku1.tampilData();
        buku2.tampilData();
        System.out.println();
    }
}

