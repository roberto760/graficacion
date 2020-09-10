/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

/**
 *
 * @author mikaelo
 */
public class Calculo {
    
    public int getRandom(int max, int min){
        int valorDado = (int) Math.floor(Math.random()*max+min);
        return valorDado;
    }
    
    public double getRandom(double max, double min){
        return Math.random()*max+min;
    }
    

    public static void main(String args[]){
        System.out.println(new Calculo().getRandom(5000, 1) );
    }
    
}
