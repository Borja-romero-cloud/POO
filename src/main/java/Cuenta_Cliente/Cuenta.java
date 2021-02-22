/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta_Cliente;


public class Cuenta {
    
    double saldo;
    int numero_cuenta;
    
    
    public Cuenta(double saldo,int numero_cuenta){
        
        this.saldo=saldo;
        this.numero_cuenta=numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }
    
    public void insertarDinero(double cantidad){
        
        saldo+=cantidad;
        System.out.println("Saldo: " + saldo);
    }
    public void retirarDinero(double cantidad){
        
        if(saldo<cantidad){
            
            System.out.println("No hay dinero suficiente");
        }else{
            
            saldo-=cantidad;
            
            System.out.println("El saldo es de: " + saldo);
        }
    }
    
    
}
