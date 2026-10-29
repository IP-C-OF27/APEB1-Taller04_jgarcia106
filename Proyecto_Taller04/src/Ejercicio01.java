import java.util.Scanner;
/**
 * Ejercicio 01 "Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario."
 * @author Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Deme la base del triangulo: ");
        base = tcl.nextDouble();
        System.out.println("Deme la altura del triangulo: ");
        altura = tcl.nextDouble();
        area = (base * altura) / 2;
        System.out.println("Area: " + area); 
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme la base del triangulo: 
10
Deme la altura del triangulo: 
13
Area: 65.0
BUILD SUCCESSFUL (total time: 13 seconds)
 */    
