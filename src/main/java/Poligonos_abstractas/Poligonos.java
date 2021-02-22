/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poligonos_abstractas;

public abstract class  Poligonos {
    
    int numero_lados;
    
    public Poligonos(int numero_lados){
        
        this.numero_lados=numero_lados;
    }

    @Override
    public String toString() {
        return "Poligonos{" + "numero_lados=" + numero_lados + '}';
    }

    public int getNumero_lados() {
        return numero_lados;
    }

    public void setNumero_lados(int numero_lados) {
        this.numero_lados = numero_lados;
    }
    
    public abstract double calcularArea();
    
    
}
