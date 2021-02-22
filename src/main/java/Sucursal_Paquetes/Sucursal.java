/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sucursal_Paquetes;


public class Sucursal {
    
    int numero_sucursal;
    String ciudad;
    String direccion;
    
    
    public Sucursal(int numero_sucursal, String ciudad, String direccion){
        
        this.numero_sucursal=numero_sucursal;
        this.ciudad=ciudad;
        this.direccion=direccion;
      
    }

    public int getNumero_sucursal() {
        return numero_sucursal;
    }

    public void setNumero_sucursal(int numero_sucursal) {
        this.numero_sucursal = numero_sucursal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "numero_sucursal=" + numero_sucursal + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }
    
    public double precioPaquete(Paquete t){
        
        double precio;
        precio= t.getPeso();
        
        if(t.getPrioridad()==1){
            
            precio+=20;
            
        }if (t.getPrioridad()==2) {
            precio+=10;
        }
        
                
          return precio;      
                
        
        
        
    }
    
}
