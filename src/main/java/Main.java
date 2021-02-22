
import Cuenta_Cliente.Cliente;
import Cuenta_Cliente.Cuenta;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Main {
    
    public static void main(String[] args) {
        
        String nombre;
        String apellido;
        String dni;
        Scanner entrada= new Scanner(System.in);
        double cantidad;
        double saldo;
        int numero_cuenta;
        Cuenta cuentas[];
        Cliente cliente;
        int opcion;
        int numeros_de_cuentas;
        
        System.out.println("Digite el numero de cuentas que existirán");
        numeros_de_cuentas=entrada.nextInt();
        cuentas= new Cuenta[numeros_de_cuentas];
        for(int i=0; i<cuentas.length;i++){
            
            System.out.println("Digite el saldo");
            saldo=entrada.nextDouble();
            System.out.println("Digite numero de cuenta");
            numero_cuenta=entrada.nextInt();
            cuentas[i]= new Cuenta(saldo, numero_cuenta);
            
        }
        cliente= new Cliente("Borja","Romero","7575757g",cuentas);
        
        System.out.println("Elige una opcion\n 1-Ingresar Dinero\n 2-Retirar dinero");
        opcion= entrada.nextInt();
        
        
        do{
            System.out.println("Elige una opcion\n 1-Ingresar Dinero\n 2-Retirar dinero");
            opcion= entrada.nextInt();
        
        switch(opcion){
            
            
            case 1:
                
                System.out.println("Elige la cantidad");
                cantidad= entrada.nextDouble();
                System.out.println("Elige el numero de cuenta");
                numero_cuenta= entrada.nextInt();
                cliente.ingresarDinero(cantidad, numero_cuenta);
                break;
                
            case 2:
                
                System.out.println("Elige la cantidad");
                cantidad= entrada.nextDouble();
                System.out.println("Elige el numero de cuenta");
                numero_cuenta= entrada.nextInt();
                cliente.retirarDinero(cantidad, numero_cuenta);
                break;
                
            case 3:
                
                System.out.println("Elige el numero de cuenta");
                numero_cuenta= entrada.nextInt();
                cliente.consultarSaldo(numero_cuenta);
                break;
                
            case 4:
                
                System.out.println("Salir del programa");
                break;
                
                
                
            
        }
        
        
    }while(opcion!=4);
    
}
}
