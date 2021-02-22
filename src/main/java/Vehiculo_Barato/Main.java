/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo_Barato;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String[] args) {
        int numero_vehiculos;
         Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce el número de vehiculos");
        numero_vehiculos=entrada.nextInt();
        String marca;
        String modelo;
       double precio;
        Vehiculo[] v= new Vehiculo[numero_vehiculos];
       
        
        for(int i=0; i<v.length;i++){
        System.out.println("Introduce la marca del vehiculo");
        marca=entrada.next();
        System.out.println("Introduce el modelo del vehiculo");
        modelo=entrada.next();
        System.out.println("Introduce el precio del vehiculo");
        precio=entrada.nextInt();
        v[i]=new Vehiculo(marca, modelo, precio);
        
            
            
        }
        precio_Barato(v);
       
        
    }
     public static void precio_Barato(Vehiculo[] veh){
        
       Vehiculo v_barato=veh[0];
       
     for(int i=0; i<veh.length;i++){
         double aux=veh[0].getPrecio();
         
         
         
         if(veh[i].getPrecio()>aux){
             v_barato=veh[0];
             
         }
         else{
             v_barato=veh[i];
             
            
         }
     }
     
         System.out.println("El vehiculo mas barato es: " + v_barato.toString() );
     
   
    }
        
    
}

