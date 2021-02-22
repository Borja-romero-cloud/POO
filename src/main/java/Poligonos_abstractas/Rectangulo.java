/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poligonos_abstractas;


public class Rectangulo extends Poligonos  {
    
    int lado1;
    int lado2;
    
    public Rectangulo(int l1, int l2){
        
        super(2);
        this.lado1=lado1;
        this.lado2=lado2;
       
    }
   

   

    

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    @Override
    public String toString() {
        return "Rectangulo{" + super.toString() + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
     @Override
    public double calcularArea() {
        double area;
        
        area= lado1*lado2;
        
        return area;
    }
    
}
