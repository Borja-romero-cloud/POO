/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sucursal_Paquetes;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        double peso;
        int prioridad;
        String dni;
        int numero_paquete;
        int numero_sucursal;
        int numero_de_paquetes;
        int numero_sucursales;
        int buscar_sucursal;
        int buscar_paquete;      
        int indice_sucursal=0;
        int indice_paquete=0;
        String ciudad;
        double precio_paquete;
        String direccion;
        int opcion;
        Scanner entrada= new Scanner(System.in);
        Sucursal[] sucursal;
        Paquete[] paquetes;
        
        System.out.println("Introduce el número de paquetes que habrán");
        numero_de_paquetes= entrada.nextInt();
        paquetes= new Paquete[numero_de_paquetes];
        System.out.println("Introduce el número de sucursales que habrán");
        numero_sucursales= entrada.nextInt();
        sucursal= new Sucursal[numero_sucursales];
        
        do{
            
            System.out.println("\t Menú");
            System.out.println("1- Crear nueva sucursal");
            System.out.println("2- Enviar paquete");
            System.out.println("3- Consultar sucursal");
            System.out.println("4- Consultar paquete");
            System.out.println("5- Mostrar datos sucursal");
            System.out.println("6- Mostrar datos paquete");
            System.out.println("7- Salir");
            
            System.out.println("Elige una opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
            
            
                case 1:
             System.out.println("Número Sucursal");
             numero_sucursal= entrada.nextInt();
             System.out.println("Introduce la ciudad en la que se encuentra la sucursal");
             ciudad= entrada.next();
             System.out.println("Introduce la direccion en la que se encuentra la sucursal");
             direccion= entrada.next();
             
             sucursal[indice_sucursal]= new Sucursal(numero_sucursal,ciudad, direccion);
             
             indice_sucursal++;
            
            break;
            
                case 2:
                    System.out.println("Introduce el número de sucursal a enviar el paquete");
                    numero_sucursal= entrada.nextInt();
                    int indice;
                    indice=comprobarSucursal(sucursal, numero_sucursal);
                    if(indice!=-1){
                        
                        System.out.println("Introduce el numero de referencia");
                        numero_paquete= entrada.nextInt();
                        System.out.println("Introduce el numero de dni");
                        dni= entrada.next();
                        System.out.println("Introduce el peso");
                        peso= entrada.nextDouble();
            
                        System.out.println("Introduce la prioridad");
                       prioridad= entrada.nextInt();
      
                       paquetes[indice_paquete]=new Paquete(numero_paquete, dni, peso, prioridad);
                       indice_paquete++;
                    }else{
                        
                        System.out.println("El número de sucursal no existe");
                    }
                  
                    
                    
                    break;
                    
                case 3:
                    
                    System.out.println("Introduce el número de sucursal");
                    numero_sucursal=entrada.nextInt();
                    buscar_sucursal=comprobarSucursal(sucursal, numero_sucursal);
                    if(buscar_sucursal!=-1){
                        
                        System.out.println(sucursal[buscar_sucursal].toString());
                    }else{
                        System.out.println("La sucursal no existe");
                    }
                    break;
                    
                case 4:
                    
                     System.out.println("Introduce el número de paquete");
                    numero_paquete=entrada.nextInt();
                    buscar_paquete=comprobarPaquete(paquetes, numero_paquete);
                    if(buscar_paquete!=-1){
                        
                        System.out.println(paquetes[buscar_paquete].toString());
                    }else{
                        System.out.println("El número de paquete no existe");
                    }
                    break;
                    
                case 5:
                    
                    for(int i=0; i<sucursal.length;i++){
                        
                        System.out.println(sucursal[i].toString());
                    }
                    break;
                    
                    
                case 6:
                    
                     for(int i=0; i<paquetes.length;i++){
                        
                        System.out.println(paquetes[i].toString());
                    }
                    break;
                    
                case 7:
                    
                    System.out.println("Has salido del menú");
                    break;
        }
                   
            
            
        }while(opcion>0 && opcion<7);
        
        
         
        
}
    public static int comprobarPaquete(Paquete[] p,int n){
        boolean encontrado=false;
        int indice=0;
        
        for(int i=0; i<p.length;i++){
            
            if(p[i].getNumero_referencia()==n){
                encontrado=true;
                System.out.println(p[i].getNumero_referencia());
                indice=i;
                
                
            }else{
                
                encontrado=false;
                System.out.println(p[i].getNumero_referencia());
                indice=-1;
                
            }
            
        }
        
       return indice;
    }
    
    public static int comprobarSucursal(Sucursal [] s, int n){
        
        int indice=0;
        
        for(int i=0; i<s.length;i++){
            
            if(s[i].getNumero_sucursal()==n){
                
                indice=n;
            }else{
                
                indice=-1;
            }
            
        }
        return indice;
    }
    
    
}



