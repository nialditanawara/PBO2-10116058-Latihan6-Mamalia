/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan6.mamalia;

/**
 *
 * @author xider  
 * NAMA  : Alfan Wahyudi
 * KELAS : PBO3
 * NIM   : 10117118
 * Deskripsi Program : Program ini berisi program untuk menambahkan jumlah
 * kambing global dan cara pengaksesan variabel

 */
public class KambingStatic {
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING ="MIDUN";
    
    public static void main(String[] args) {
        PBO210116058Latihan6Mamalia.jumlahKambing =485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak"
                            + PBO210116058Latihan6Mamalia.jumlahKambing);
    }
}