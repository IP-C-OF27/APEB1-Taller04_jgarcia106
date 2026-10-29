
import java.util.Scanner;
/**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres 
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia."
 * @author Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double gastoHijo1;
        double gastoHijo2;
        double gastoHijo3;
        double totalGasto;
        System.out.println("Deme los gastos: ");
        gastoHijo1 = tcl.nextDouble();
        gastoHijo2 = tcl.nextDouble();
        gastoHijo3 = tcl.nextDouble();
        totalGasto = (gastoHijo1 + gastoHijo2 + gastoHijo3);
        System.out.println("El total del gasto es: " + totalGasto);
    }  
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Deme los gastos: 
12
13
16
El total del gasto es: 41.0
BUILD SUCCESSFUL (total time: 12 seconds)
 */
    
