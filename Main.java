/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author Frosz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int sementara;
        
        System.out.println("+-------------------------+");
        System.out.println("|PROGRAM KONVERSI SUHU AIR|");
        System.out.println("+-------------------------+");
        System.out.println("Input Data");
        System.out.println("-----------------------");
        System.out.println("Suhu air dalam celcius : ");
        double in = Input.nextDouble();
        Konversi convert = new Konversi();
        convert.c=in;
        
        do{
        System.out.println("Opsi");
        System.out.println("-----------------------");
        System.out.println("1. Lihat data konversi ");
        System.out.println("2. Edit data konversi ");
        System.out.println("3. Exit ");
        System.out.println("Pilih : ");
        int pil = Input.nextInt();
        sementara = pil;
        switch(pil){
            case 1 : convert.operasi();
                    break;
            case 2 : System.out.println("Input Data");
        System.out.println("-----------------------");
        System.out.println("Suhu air dalam celcius : ");
        double in2 = Input.nextDouble();
        convert.c=in2;
        break;
            case 3 : System.out.println("Program Berakhir");
            break;
            default : System.out.println("Opsi ");
                    }
        }while(sementara !=3);
        
        // TODO code application logic here
    }
    
}
