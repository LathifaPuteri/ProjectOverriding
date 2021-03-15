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
public class Volume extends induk{
    int panjang1;
    int panjang2;
    int lebar1;
    int lebar2;
    int tinggi1;
    int tinggi2;
    
    //void input panjang, lebar dan tinggi balok
    public void volumeBalok(){
        Scanner input = new Scanner (System.in);
        System.out.println("Panjang :");
        panjang1 = input.nextInt();
        System.out.println("Lebar :");
        lebar1 = input.nextInt();
        System.out.println("Tinggi :");
        tinggi1 = input.nextInt();
        System.out.println("Panjang balok = "+panjang1);
        System.out.println("Lebar balok = "+lebar1);
        System.out.println("Tinggi balok = "+tinggi1);
    }
    //void rumus dan hasil Volume balok
    public void hasilbalok(){
        System.out.println("Hasil Voume Balok = "+(panjang1*lebar1*tinggi1));
    }
    //void iput panjang, lebar dana tinggi prisma segitiga
    public void volumeprisma(){
        Scanner input = new Scanner (System.in);
        System.out.println("Panjang :");
        panjang2 = input.nextInt();
        System.out.println("Lebar:");
        lebar2 = input.nextInt();
        System.out.println("Tinggi :");
        tinggi2 = input.nextInt();
        System.out.println("Panjang prisma segitiga = "+panjang2);
        System.out.println("Lebar prisma segitiga = "+lebar2);
        System.out.println("Tinggi prisma segitiga = "+tinggi2);
    }
    //void rumus dan hasil Volume Prisma segitiga
    public void hasilprisma(){
        System.out.println("Hasil Volume prisma segitiga = "+(panjang2*lebar2*tinggi2/2));
    }
}
