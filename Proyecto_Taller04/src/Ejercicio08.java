
import java.util.Scanner;
/**
 * Ejercicio 08: "Se debe generar una solución que permita calcular y mostrar 
 * el valor total a pagar mensual de servicios digitales de una persona. 
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify.
 * Si la persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoNetflix;
        double costoYoutube;
        double costoDropbox;
        double costoSpotify;
        int edad;
        double subtotal;
        double descuento = 0.0;
        double valorTotal;
        System.out.println("Ingrese el costo mensual Netflix: ");
        costoNetflix = tcl.nextDouble();
        System.out.println("Ingrese costo mensual Youtube: ");
        costoYoutube = tcl.nextDouble();
        System.out.println("Ingrese costo mensual Dropbox: ");
        costoDropbox = tcl.nextDouble();
        System.out.println("Ingrese costo mensual Spotify: ");
        costoSpotify =tcl.nextDouble();
        System.out.println("Ingrese la edad del usuario: ");
        edad = tcl.nextInt();
        subtotal = costoNetflix + costoYoutube + costoDropbox + costoSpotify;
        if (edad < 30){
            descuento = subtotal * 0.20;
        }
        valorTotal = subtotal - descuento;
        System.out.println("Subtotal de servicios: $" + subtotal);
        System.out.println("Descuento(20%): $" + descuento);
        System.out.println("El valor total es: $" + valorTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *run:
Ingrese el costo mensual Netflix: 
10.99
Ingrese costo mensual Youtube: 
9.99
Ingrese costo mensual Dropbox: 
7.19
Ingrese costo mensual Spotify: 
6.50
Ingrese la edad del usuario: 
22
Subtotal de servicios: $34.67
Descuento(20%): $6.934000000000001
El valor total es: $27.736
BUILD SUCCESSFUL (total time: 20 seconds)
 */
    
                
       
        
        
        
    