/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal4;

import java.util.ArrayList;

/**
 *
 * @author muhamad alfian bisri
 */
public class main {
    public static void main(String[] args) {
        System.out.println("=== SOAL 4: SISTEM PEMERIKSAAN KLINIK ===");
        ArrayList<Pemeriksaan> daftarPemeriksaan = new ArrayList<>();

        daftarPemeriksaan.add(new Pemeriksaan("PMR-001", "Budi Santoso", "Dr. Anita, Sp.A", 150000.0));
        daftarPemeriksaan.add(new Pemeriksaan("PMR-002", "Siti Aminah", "Dr. Hendra, Sp.PD", 200000.0));
        daftarPemeriksaan.add(new Pemeriksaan("PMR-003", "Ahmad Fauzi", "Dr. Rian, Sp.THT", 175000.0));

        for (Pemeriksaan p : daftarPemeriksaan) {
            p.tampilData();
        }
        System.out.println();
    }
}
