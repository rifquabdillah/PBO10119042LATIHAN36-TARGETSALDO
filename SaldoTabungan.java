/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Muhammad RIfqu Abdillah
 *  Nama : Muhammad Rifqu Abdillah
 *  Kelas: Pbo-IF1
 *  Nim : 10119042 
 *  Deskripsi : Program ini berisi tentang target saldo tabungan
 */
public class SaldoTabungan {

private static Double jumlahBunga;
private static int lama;

private static double hitungBunga(double bunga, int saldo){
    jumlahBunga= (bunga/100) * saldo;
    return jumlahBunga;
}
   public static void tampilSaldo(double bunga, int saldo, int targetSaldo){
       lama = 1;
       while(saldo < targetSaldo){
           saldo += hitungBunga(bunga, saldo);
           System.out.printf("Saldo di bulan ke-"+lama+"Rp. %,d&n",saldo);
           lama++;
       }
   }

    
}
