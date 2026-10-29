import java.util.Scanner;
/**
 * Ejercicio 04: "Generar un solución que permita calcular y mostrar el pago 
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar."
 * @author Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double montoPrestamo;
        double interesMensual;
        double costoCapital;
        double cuotaInteres;
        double pagoMensual;
        System.out.println("Ingrese el monto del préstamo:");
        montoPrestamo = tcl.nextDouble();
        System.out.println("Ingrese el interes mensual: ");
        interesMensual = tcl.nextDouble();
        //pagoMensual = (montoPrestamo / 12) + interesMensual;
        costoCapital = montoPrestamo / 12;
        cuotaInteres = montoPrestamo * (interesMensual / 100);
        pagoMensual = costoCapital + cuotaInteres;
        System.out.println("El pago mensual a rralizar es: $" + pagoMensual);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *run:
Ingrese el monto del pr�stamo:
1200
Ingrese el interes mensual: 
2
El pago mensual a rralizar es: $124.0
BUILD SUCCESSFUL (total time: 17 seconds)
 */
    
