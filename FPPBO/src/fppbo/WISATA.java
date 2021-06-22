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
public class WISATA {
    String [][]wisata = {{"","Bali","Lombok","Danau Toba",},
                         {"","3H/2M","4H/3M","5H/4M"},
                         {"","1728000","4250000","3280000"}};
    public Scanner input;
    String tujuan, lama;
    int pilihan, harga, tagihan,org,total;
    float disc;
    public WISATA(){
        this.input = new Scanner(System.in);
        System.out.print("\n Pilih Paket Wisata : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1 : {
                System.out.print(" masukan jumlah org : ");
                org = input.nextInt();
                tujuan = wisata[0][pilihan];
                lama = wisata[1][pilihan];
                harga = Integer.parseInt(wisata[2][pilihan]);
                tagihan = harga*org;
                break;
            }
            case 2 : {
                System.out.print(" masukan jumlah org : ");
                org = input.nextInt();
                tujuan = wisata[0][pilihan];
                lama = wisata[1][pilihan];
                harga = Integer.parseInt(wisata[2][pilihan]);
                tagihan = harga*org;
                break;
            }
            case 3 : {
                System.out.print(" masukan jumlah org : ");
                org = input.nextInt();
                tujuan = wisata[0][pilihan];
                lama = wisata[1][pilihan];
                harga = Integer.parseInt(wisata[2][pilihan]);
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
