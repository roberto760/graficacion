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
public class Coordenadas {
    
    private int xInicial;
    private int yInicial;
    private int x;
    private int y;
    
    public Coordenadas(){}
    
    
    public Coordenadas(int xInicial, int yInicial, int x, int y){
        this.xInicial = xInicial;
        this.yInicial = yInicial; 
        this.x = x;
        this.y = y;
    }

    public int getxInicial() {
        return xInicial;
    }

    public void setxInicial(int xInicial) {
        this.xInicial = xInicial;
    }

    public int getyInicial() {
        return yInicial;
    }

    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
