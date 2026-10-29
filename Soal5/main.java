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
public class main {
    public static void main(String[] args) {
        System.out.println("=== SOAL 5: SISTEM TIKET BIOSKOP ===");
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new Tiket("TKT-01", "Avatar: The Way of Water", "Reguler (Studio 1)", 45000.0, 2));
        daftarTiket.add(new Tiket("TKT-02", "Avengers: Endgame", "IMAX 3D", 75000.0, 3));

        for (Tiket t : daftarTiket) {
            t.tampilData();
            System.out.println();
        }
    }
}
