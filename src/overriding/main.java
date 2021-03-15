/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author MOKLET-2
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        induk print = new induk();
        
        System.out.println(print.Print1());
        System.out.println("****************************************************");
        
        //mendeklarasikan objek
        Luas Bangundatar = new Luas();
        
        //Luas persegi panjang
        System.out.println(print.judul1());
        Bangundatar.luaspersegi();
        Bangundatar.hasilpersegi();
        System.out.println("----------------------------------------------------");
        
        //Luas segitiga
        System.out.println(print.judul2());
        Bangundatar.luassegitiga();
        Bangundatar.hasilsegitiga();
        System.out.println("====================================================");
        
        System.out.println(print.Print2());
        System.out.println("****************************************************");
        
        //mendeklarasikan objek
        Volume Bangunruang = new Volume();
        
        //volume balok
        System.out.println(print.judul3());
        Bangunruang.volumeBalok();
        Bangunruang.hasilbalok();
        System.out.println("----------------------------------------------------");
        
        //volume prisma segitiga
        System.out.println(print.judul4());
        Bangunruang.volumeprisma();
        Bangunruang.hasilprisma();
    }
    
}
