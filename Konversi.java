/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Frosz
 */
public class Konversi {
    double c,r,f,k;
    
    Konversi(){
        this.c=c;
    }
    void operasi(){
        r=(4*c)/5;
        f=(9*c)/5 +32;
        k= c + 273.15;
        System.out.println("Suhu Dalam Celcius   : "+c+"°C");
        System.out.println("Suhu Dalam Reamur    : "+r+"°R");
        System.out.println("Suhu Dalam Farenheit : "+f+"°F");
        System.out.println("Suhu Dalam Kelvin    : "+k+" K");
        if(c>0 && c<100){
        System.out.println("Suhu Air Normal");
        }
        else if(c<=0){
        System.out.println("Suhu Air Berada di Batas Titik Beku");
        }
        else if(c>=100){
        System.out.println("Suhu air Berada di Batas Titik Didih");
        }
    }
}
