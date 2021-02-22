/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poligonos_abstractas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
         
       
         
         
         int base;
         Triangulo t;
         Rectangulo r;
        char respuesta;
         int opcion;
          int lado1;
          int lado2;
         
         Scanner entrada= new Scanner(System.in);
         int altura;
       
         List<Poligonos> poligonos= new ArrayList<Poligonos>();
         
         
         do {   
             
             System.out.println("\t Menu");
             System.out.println("1-Crear triángulo");
             System.out.println("2-Crear rectangulo");
             System.out.println("3-Mostrar poligonos");           
             System.out.println("Elige la opción");
             opcion= entrada.nextInt();
             switch(opcion){
                 
                 case 1:
                     
             System.out.println("Introduce el valor de la base");
             base= entrada.nextInt();
             System.out.println("Introduce el valor de la altura");
             altura= entrada.nextInt();
             t = new Triangulo(base,altura);
             poligonos.add(t);
             
             break;
             
                 case 2:
                    
                     
             System.out.println("Introduce el valor del lado 1");
             lado1= entrada.nextInt();
             System.out.println("Introduce el valor del lado 2");
             lado2= entrada.nextInt();
             r = new Rectangulo(lado1,lado2);
             System.out.println(r.getLado1());
             System.out.println(r.getLado2());
                    
             poligonos.add(r); 
          
             break;
             
                /* case 3:
                     
                     for(int i=0; i<poligonos.size();i++){
                         
                         poligonos.get(i).calcularArea();
                         poligonos.get(i).toString();
                     }
                     
                     break;*/
             
                 case 3:
                     
                     for(Poligonos poli: poligonos){
                         
                         System.out.println("Datos del polígono:" + poli.toString());
                         System.out.println("Área del polígono: " + poli.calcularArea());
                     }
                     break;
                     
                      
              
            
             }            
              System.out.println("Desea continuar?");
             respuesta= entrada.next().charAt(0);
        } while (respuesta=='s' || respuesta=='S');
         
         
    }
    
   
    
    
}
