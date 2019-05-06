/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

/**
 *
 * @author User
 */
public class Ejercicios {
    public static void main(String[]args){
        //8.15
        double k = 0.7, t, ant;
        double e = 2.71828182845904523536;
        int w = 4, i=0;
        t = 1;
        double x = 300.0;
        do{            i += 1;
            ant = x;
            x = x - (Math.pow(x,3)-Math.pow(x,2)+x-1)/(3*Math.pow(x,2)-2*x+1);            
        }while(Math.abs((x-ant)/x)*100 > 0.01);
        System.out.println(i);
        System.out.println(x);
        
    }
}
