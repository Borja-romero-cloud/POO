/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta_Cliente;


public class Cliente {
    
    String dni;
    String apellido;
    String nombre;
    Cuenta[]cuenta;
    
    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuenta){
        
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.cuenta=cuenta;
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta[] getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta[] cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", cuenta=" + cuenta + '}';
    }
    
    public void ingresarDinero(double cantidad, int n){
        
        for(int i=0; i<cuenta.length;i++){
            
            if(cuenta[i].getNumero_cuenta()==n){
            
            cuenta[i].insertarDinero(cantidad);
            break;
        }else{
            
            System.out.println("La cuenta no existe");
            break;
        }
        }
    }
    public void retirarDinero(double cantidad, int n){
        
        
        for(int i=0; i<cuenta.length;i++){
            
            if(cuenta[i].getNumero_cuenta()==n){
            
            cuenta[i].retirarDinero(cantidad);
            break;
        }else{
            
            System.out.println("La cuenta no existe");
            break;
        }
        }
        
    }
    
    
    public void consultarSaldo(int n){
        
        cuenta[n].getSaldo();
    }
    
}
