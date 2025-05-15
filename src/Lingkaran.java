/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Lingkaran {
    static final double PI = 3.141592;

    void hitungLuas(double r) {
        double luas = PI * r * r;
        System.out.println("Luas sebagai bilangan pecahan: " + luas);

        int luasBulat = (int) luas;
        System.out.println("Luas sebagai bilangan bulat (type-casting): " + luasBulat);

        long luasPembulatan = Math.round(luas);
        System.out.println("Luas setelah pembulatan (rounding): " + luasPembulatan);
    }
}
