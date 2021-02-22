
package Triangulo_isosceles;


public class Main {
    
    public static void main(String[] args) {
        
        double lado1=5.2;
        double lado2=lado1;
        double altura=6.8;
        double base=4.5;
        
        Isosceles t1= new Isosceles(lado1,lado2,base,altura);
        System.out.println("Perímetro: " + t1.getPerimetro());
        System.out.println("Area: " + t1.getArea());
        System.out.println(t1.getLado2());
    
    }
    
}
