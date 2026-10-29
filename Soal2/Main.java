/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author muhamad alfian bisri
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SOAL 2: KALKULATOR RENTAL SEPEDA ===");
        Sepeda sepeda1 = new Sepeda("SPD-01", "Sepeda Gunung (MTB)", 3, 15000.0);
        Sepeda sepeda2 = new Sepeda("SPD-02", "Sepeda Kota (City Bike)", 5, 10000.0);

        sepeda1.tampilData();
        sepeda2.tampilData();
        System.out.println();
    }
}
