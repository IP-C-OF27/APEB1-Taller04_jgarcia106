
import java.util.Scanner;
/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes."
 * @author Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);  
        double costoMinuto;
        double minutoConsumido;
        double valorPlanilla;
        System.out.println("Ingrese el costo por minuto: ");
        costoMinuto = tcl.nextDouble();
        System.out.println("Ingrese el tiempo consumido: ");
        minutoConsumido = tcl.nextDouble();
        valorPlanilla = costoMinuto * minutoConsumido;
        System.out.println("El valor de la planilla es: $" + valorPlanilla);          
    }  
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese el costo por minuto: 
2.5
Ingrese el tiempo consumido: 
30
El valor de la planilla es: $75.0
BUILD SUCCESSFUL (total time: 15 seconds)
 */
 