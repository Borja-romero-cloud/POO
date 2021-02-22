/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sucursal_Paquetes;


public class Paquete {
    int numero_referencia;
    String dni;
    double peso;
    int prioridad;
    
    public Paquete(int numero_referencia, String dni, double peso, int prioridad){
        
        this.numero_referencia=numero_referencia;
        this.dni=dni;
        this.peso=peso;
        this.prioridad=prioridad;
    }

    public int getNumero_referencia() {
        return numero_referencia;
    }

    public void setNumero_referencia(int numero_referencia) {
        this.numero_referencia = numero_referencia;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Paquete{" + "numero_referencia=" + numero_referencia + ", dni=" + dni + ", peso=" + peso + ", prioridad=" + prioridad + '}';
    }

    
    
    
}
