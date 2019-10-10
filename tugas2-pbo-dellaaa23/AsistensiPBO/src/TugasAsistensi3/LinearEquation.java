/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsistensi3;

import java.text.DecimalFormat;

/**
 *
 * @author user
 */
public class LinearEquation {
    private int a,b,d;
    private double c,e,f;
    
    public LinearEquation(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }
    public LinearEquation(int a, int b, double c, int d, double e , double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return b;
    }
    public void setC(double c){
        this.c = c;
    }
    public double getC(){
        return c;
    }
    public void setD(int d){
        this.d = d;
    }
    public int getD(){
        return d;
    }
    public void setE(double e){
        this.e = e;
    }
    public double getE(){
        return e;
    }
    public void setF(double f){
        this.f = f;
    }
    public double getF(){
        return f;
    }
    public void LinearEquationInfo(){
        System.out.println("Sistem Persamaannya :");
        System.out.println(+getA()+"x+"+getB()+"y="+getE());
        System.out.println(+getC()+"x+"+getD()+"y="+getF());
    }
    public void CekSolusi(){
        if ((a*d)-(b*c) != 0){
        double Xx, Yy;
        Xx = ((e*d)-(b*f)) / ((a*d) - (b*c));
         DecimalFormat x  = new DecimalFormat("#.##");
        System.out.println("x = "+x.format(Xx));
        Yy = ((a*f)-(e*c)) / ((a*d) - (b*c));
        DecimalFormat y  = new DecimalFormat("#.##");
        System.out.println("y = "+y.format(Yy));
        }
        else{
            System.out.println("Tidak ada Solusinya");
        }
    }
}
