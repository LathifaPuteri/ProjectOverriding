/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Luas extends induk {
    int panjang;
    int lebar;
    int alas;
    int tinggi;
    
    //void input panjang dan lebar persegi panjang
    public void luaspersegi(){
        Scanner input = new Scanner (System.in);
        System.out.println("Panjang :");
        panjang = input.nextInt();
        System.out.println("Lebar:");
        lebar = input.nextInt();
        System.out.println("Panjang persegi panjang = "+panjang);
        System.out.println("Lebar persegi panjang = "+lebar);
    }
    //void rumus dan hasil luas persegi panjang
    public void hasilpersegi(){
        System.out.println("Hasil Luas Persegi Panjang = "+(panjang*lebar));
    }
    //void input alas dan tinggi segitiga
     public void luassegitiga(){
        Scanner input = new Scanner (System.in);
        System.out.println("Alas :");
        alas = input.nextInt();
        System.out.println("Tinggi:");
        tinggi = input.nextInt();
        System.out.println("Panjang Alas segitiga = "+alas);
        System.out.println("Tinggi segitiga = "+tinggi);
    }
     //void rumus dan hasil luas segitiga
     public void hasilsegitiga(){
        System.out.println("Hasil Luas segitiga = "+(alas*tinggi/2));
    }
}
