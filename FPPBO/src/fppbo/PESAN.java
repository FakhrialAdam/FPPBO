/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fppbo;

import java.util.Scanner;
/**
 *
 * @author Samsung
 */
public class PESAN {
    
    public Scanner input;
    String [][]wisata = {{"","Bali","Lombok","Danau Toba",},
                         {"","3H/2M","4H/3M","5H/4M"},
                         {"","1728000","4250000","3280000"}};
    String [][]ziarah = {{"","Pamijahan (Tasikmalaya)","Walisongo (jawa-madura)","Wali9+wali7 (jawa-bali)"},
                         {"","3H/2M","7H/5M","8H/6M"},
                         {"","300000","1500000","2500000"}};
    String [][]custom = {{"","Bali","Lombok","Danau Toba","P.Komodo","Belitung"},
                         {"","525000","675000","720000","759000","473000"}};
    String tujuan, lama;
    int pilih, wst, zrh, ctm, org, hari, harga, total, tw, tz, tc, tagihan1, tagihan2, tagihan3, uang, sisa;
    boolean bayar = true, metode = true, prsn = true, day = true;
    float dsc;

    public PESAN(){
        this.input = new Scanner(System.in);
        
        for (int i = 1; i <= 56; i++) {
                System.out.print("=");
                }
        System.out.println("\n        __________SELAMAT_____DATANG__________");
        System.out.println("_______________Menu_____Pilihan______TRIP_______________");
        System.out.println("|1.Paket Wisata |2.Paket Ziarah |3.Paket Harian(custom)|");
         
        for (int i = 1; i <= 56; i++) {
            System.out.print("-");
            }
        System.out.print("\nMasukkan menu pilihan anda : ");
        this.pilih = input.nextInt();
        System.out.println();
    }
    int Kembali(){
        return this.pilih;
    }

    /*
    
    void bayar(){
        while (metode){
        System.out.print("Metode Pembayaran [Cash/Transfer] : ");
        String pembayaran = in.next();
        if (pembayaran.equalsIgnoreCase("CASh")||pembayaran.equalsIgnoreCase("C")||pembayaran.equals("1")){
            while (bayar){
                System.out.print("\nmasukan saldo        = Rp.");
                uang =in.nextInt();
                sisa = uang-total;
                if(uang == total){
                    bayar = false;
                }else if (uang >= total){
                    System.out.println("=======================================");
                    System.out.println("Sisa Cash            = Rp."+sisa);
                    bayar = false;
                }else if(uang <= total){
                    System.out.println("Uang Anda Kurang     = Rp."+sisa+"\n");
                    bayar = true;
                    }
            } metode = false;
        } else if(pembayaran.equalsIgnoreCase("Transfer")||pembayaran.equalsIgnoreCase("T")||pembayaran.equals("2")){
            System.out.println("\nTotal Tagihan   : Rp."+total+",-\n");
            metode = false;
        } else {
            System.out.println("\nMetode tidak ada / salah input");
            System.out.println("Silahkan Masukan Metode yang tersedia\n");
            metode = true;
            } 
        }
    }*/
}
