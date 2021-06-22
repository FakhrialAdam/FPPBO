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
public class ZIARAH {
    String [][]ziarah = {{"","Pamijahan (Tasikmalaya)","Walisongo (jawa-madura)","Wali9+wali7 (jawa-bali)"},
                         {"","3H/2M","7H/5M","8H/6M"},
                         {"","300000","1500000","2500000"}};
    public Scanner input;
    String tujuan, lama;
    int pilihan, harga, tagihan,org,total;
    float disc;
    
    public ZIARAH(){
        this.input = new Scanner(System.in);
        System.out.print("\n Pilih Paket Ziarah : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1 : {
                System.out.print(" masukan jumlah org : ");
                org = input.nextInt();
                tujuan = ziarah[0][pilihan];
                lama = ziarah[1][pilihan];
                harga = Integer.parseInt(ziarah[2][pilihan]);
                tagihan = harga*org;
                break;
            }
            case 2 : {
                System.out.print(" masukan jumlah org : ");
                org = input.nextInt();
                tujuan = ziarah[0][pilihan];
                lama = ziarah[1][pilihan];
                harga = Integer.parseInt(ziarah[2][pilihan]);
                tagihan = harga*org;
                break;
            }
            case 3 : {
                System.out.print(" masukan jumlah org : ");
                org = input.nextInt();
                tujuan = ziarah[0][pilihan];
                lama = ziarah[1][pilihan];
                harga = Integer.parseInt(ziarah[2][pilihan]);
                tagihan = harga*org;
                break;
            }
            default : {
            }
        }
    }
    public float Diskon(float disc){
        if (org <= 5){
            System.out.println(" diskon 5%");
            this.disc = (int) (tagihan*0.05);
        }else if (org <= 15){
            System.out.println(" diskon 10%");
            this.disc = (int) (tagihan*0.10);
        }else if (org <= 40){
            System.out.println(" diskon 20%");
            this.disc = (int) (tagihan*0.20);
        }else if (org >= 50){
            System.out.println(" diskon 25%");
            this.disc = (int) (tagihan*0.25);
            }
        return this.disc;
    }
    int Total(){
        this.total = (int) (tagihan - Diskon(disc));
        return this.total;
    }
    String Tampilkan(){
        System.out.println("\nRincian perjalanan Wisata anda");
        System.out.println("----------------------------------");
        System.out.println("Perjalanan       : "+tujuan);
        System.out.println("Lama perjalanan  : "+lama);
        System.out.println("jumlah pembelian : "+org+" Kursi");
        System.out.println("Harga            : Rp."+harga+",-/org");
        System.out.println("Total harga      : Rp."+Total()+",-");
        
        return ("");
    }
}
