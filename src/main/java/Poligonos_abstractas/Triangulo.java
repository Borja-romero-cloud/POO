/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poligonos_abstractas;


public class Triangulo extends Poligonos {
    
   
    int base;
    int altura;
    int numero_lados;
    
    
    public Triangulo(int base, int altura){
        
        super(3);
        this.base=base;
        this.altura=altura;
       
    }

    @Override
    public double calcularArea() {
        
        double area;
        
        area= (base*altura)/2;
        
        return area;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + super.toString() + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
