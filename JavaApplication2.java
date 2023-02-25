
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

 public static void main(String[] args) {
     int bakiye=5000,paracekme,parayatirma;
     Scanner veri = new Scanner(System.in);
     while(true){
         System.out.println("Para cekmek icin 1 giriniz:");
         System.out.println("Para yatirmak icin 2 giriniz:");
         System.out.println("Bakiye sorgulamak icin 3 giriniz:");
         System.out.println("Kart iadesi icin 4 giriniz:");
         System.out.println("Yapmak istediginiz islemi seciniz:");
         int secim = veri.nextInt();
         switch (secim) {
             case 1:
                 System.out.println("Cekilecek parayi giriniz:");
                 paracekme = veri.nextInt();
                 if(bakiye>=paracekme){
                 bakiye=bakiye-paracekme;
                 }
                 else{
                     System.out.println("Bakiyeniz yetersiz...");
                 }
                 System.out.println("");
                 break;
             case 2:
                 System.out.println("Yatirilacak parayi giriniz:");
                 parayatirma = veri.nextInt();
                 bakiye=bakiye+parayatirma;
                 System.out.println("");
                 break;
             case 3:
                 System.out.println("Bakiyeniz:" +bakiye);
                 System.out.println("");
                 break;
             case 4:
                 System.exit(1);
                 break;
             
         }
     }
     
 }
 }

 

