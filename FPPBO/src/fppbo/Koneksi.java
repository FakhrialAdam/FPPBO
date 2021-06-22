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
public class Koneksi {
    String ID,pass;
    public Scanner inputan;
    public Koneksi(){
        this.inputan = new Scanner(System.in);
        
        System.out.print("Masukkan Username : ");
        this.ID = inputan.nextLine();
        System.out.print("Masukkan Password : ");
        this.pass = inputan.nextLine();
    }
    String Masuk(){
        return ID;
    }
}
