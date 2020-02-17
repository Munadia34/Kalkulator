
package kalkulator;

import Trigono.Arc;
import Trigono.Sudut;
import java.util.Scanner;


public class Kalkulator {
        
    public static void main(String[] args) {
        String ulang, x;
        int pilih;
        double hitungsudut, hitungLog;
        Scanner input = new Scanner(System.in);
        Sudut sudut = new Sudut();
        Logaritma log = new Logaritma();
        Arc arc = new Arc();
        do{
            System.out.println("Kalkulator");
            System.out.println("1. Sin");
            System.out.println("2. Cos");
            System.out.println("3. Tan");
            System.out.println("4. Invers Sin");
            System.out.println("5. Invers Cos");
            System.out.println("6. Invers Tan");
            System.out.println("7. Logaritma");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Masukkan Sudut Sin");
                    hitungsudut = input.nextDouble();
                    sudut.setSudut(hitungsudut);
                    System.out.println("Hasil : "+ sudut.getSin());
                break;
                case 2:
                    System.out.println("Masukkan Sudut Cos");
                    hitungsudut = input.nextDouble();
                    sudut.setSudut(hitungsudut);
                    System.out.println("Hasil : "+ sudut.getCos());
                break;
                case 3:
                    System.out.println("Masukkan Sudut Tan");
                    hitungsudut = input.nextDouble();
                    sudut.setSudut(hitungsudut);
                    System.out.println("Hasil : "+ sudut.getTan());
                break;
                case 4:
                    System.out.println("Masukkan Invers Sin");
                    hitungsudut = input.nextDouble();
                    arc.setArc(hitungsudut);
                    System.out.println("Hasil : "+ arc.getASin());
                break;
                case 5:
                    System.out.println("Masukkan Invers Cos");
                    hitungsudut = input.nextDouble();
                    arc.setArc(hitungsudut);
                    System.out.println("Hasil : "+ arc.getACos());
                break;
                case 6:
                    System.out.println("Masukkan Invers Tan");
                    hitungsudut = input.nextDouble();
                    arc.setArc(hitungsudut);
                    System.out.println("Hasil : "+ arc.getATan());
                break;
                case 7:
                    System.out.println("Masukkan Logaritma");
                    hitungLog = input.nextDouble();
                    log.setLog(hitungLog);
                    System.out.println("Hasil : "+ log.getLog());
                break;
            }
            System.out.println("Ulang : ");
            input.nextLine();
            ulang = input.nextLine();
        }while(ulang.equals("y"));
    } 
}
