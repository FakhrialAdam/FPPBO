/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fppbo;
import java.util.Scanner;
/**
 *
 * @author JOE
 */
public class BAYAR {
    int pembayaran,lunas,bayar,kurang;
    public Scanner input;
    public BAYAR(){
        this.input = new Scanner(System.in);
        
        System.out.print("Metode Pembayaran :\n1. Cash\n2. Transfer\nPilih Metode : ");
        this.pembayaran = input.nextInt();
        
        switch(pembayaran){
            case 1 : {
                System.out.println("-------------------------------");
                System.out.print("\nMasukkan Nominal : ");
                this.bayar = input.nextInt();
                
                if(bayar<FPPBO.hargadibayar){
                    System.out.print("Uang Anda kurang!, Mohon Masukkan lagi : ");
                    this.kurang = input.nextInt();
                    
                    this.bayar = this.bayar + this.kurang;
                }
                
                this.lunas = FPPBO.hargadibayar - this.bayar;
                break;
            }
            case 2 : {
                this.bayar = FPPBO.hargadibayar;
                
                this.lunas = FPPBO.hargadibayar - this.bayar;
                break;
            }
            default : {
            }
        }
    }
    String Tampil(){
        System.out.println("--------------------------");
        System.out.println("Anda Telah Melakukan Pembayaran!");
        if(lunas>0){
            System.out.println("Kembalian Anda adalah "+lunas+" rupiah");
        }else{
        }
        System.out.println("--------------------------");
        
        return ("");
    }
}
