/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan46.tandanyakamu;
    
import java.util.Scanner;
import java.util.Calendar;
/**
 *
 * @author ASUS
 * NAMA : fikri maulana
 * KELAS : if2
 * NIM : 10118074
 */
public class PBO210118074LATIHAN46TandanyaKamu {
     
    private static int yearNow,umur;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scanner = new Scanner(System.in);
        yearNow = Calendar.getInstance().get(Calendar.YEAR);
        Age age = new Age(yearNow);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scanner.nextInt());
        
        umur = age.hitungUmur();
        
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + umur +" tahun");
        System.out.println("Tandanya kamu " + age.tandanyaKamu(umur));
        
        System.out.println("Developed by : fikri maulana");
    }
    
}
    

