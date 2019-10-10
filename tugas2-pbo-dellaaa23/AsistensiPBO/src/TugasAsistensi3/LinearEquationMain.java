/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class LinearEquationMain {
    public static void main(String[] args){
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Input   : ");
        int a = baca.nextInt();
        int b = baca.nextInt();
        double c = baca.nextDouble();
        int d = baca.nextInt();
        double e = baca.nextDouble();
        double f = baca.nextDouble();
        LinearEquation p1 = new LinearEquation(a,b,c,d,e,f);
        System.out.println("Output  : ");
        p1.LinearEquationInfo();
        System.out.println("Hasilnya:");
        p1.CekSolusi();
    }
}
