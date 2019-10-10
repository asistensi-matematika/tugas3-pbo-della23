
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class BilanganKompleks {
    static int real;
    static int imajiner;
    
    public static void main(String[] args){
        Scanner baca = new Scanner(System.in);
        
        String A = baca.nextLine();
        String B = baca.nextLine();
    
        char[] arrayA = A.toCharArray();
        int jumlahA = arrayA.length;
        char[] arrayB = B.toCharArray();
        int jumlahB = arrayB.length;
    
        if(jumlahA == 4 && jumlahB == 4){
        cariAngka(A,0,1,1,3);
        int r1 = real;
        int i1 = imajiner;
        cariAngka(B,0,1,1,3);
        int r2 = real;
        int i2 = imajiner;
        print(i1,i2,r1,r2);
        }
        else if (jumlahA == 2 && jumlahB == 4){
        cariAngka(A,0,0,0,1);
        int r1 = 0;
        int i1 = imajiner;
        cariAngka(B,0,1,1,3);
        int r2 = real;
        int i2 = imajiner;
        print(i1,i2,r1,r2);
        }
    }
    public static void cariAngka(String A, int r1, int r2, int i1, int i2){
        if (r1 == 0 && r2 == 0){
            real = ubahAngka("0");
        }
        else{
            String R = A.substring(r1,r2);
            real = ubahAngka(R);
        }
        String i = A.substring(i1,i2);
            imajiner = ubahAngka(i);
    }

    public static int ubahAngka(String huruf){
        int angka = Integer.parseInt(huruf);
        return angka;
    }

    public static void print(int I1, int I2, int R1, int R2){
        int hasilR = (R1*R2) - (I1*I2);
        int hasilI = (R1*I2) + (I1*R2);
        System.out.println(hasilR+"+"+hasilI+"i");
    }
}
