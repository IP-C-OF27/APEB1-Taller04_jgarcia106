import java.util.Scanner;
/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón."
 * @author Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoCPU;
        double costoTcl;
        double costoPant;
        double costoRaton;
        double costoTotal;
        System.out.println("Ingrese costo CPU");
        costoCPU = tcl.nextDouble();
        System.out.println("Ingrese costo teclado");
        costoTcl = tcl.nextDouble();
        System.out.println("Ingrese costo pantalla");
        costoPant = tcl.nextDouble();
        System.out.println("Ingrese costo ratón");
        costoRaton = tcl.nextDouble();
        costoTotal = costoCPU + costoTcl + costoPant + costoRaton;
        System.out.println("El costo total es: $" + costoTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *run:
Ingrese costo CPU
20
Ingrese costo teclado
15
Ingrese costo pantalla
19.80
Ingrese costo rat�n
10
El costo total es: $64.8
BUILD SUCCESSFUL (total time: 19 seconds)
 */