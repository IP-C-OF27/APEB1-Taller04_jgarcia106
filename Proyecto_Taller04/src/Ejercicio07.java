import java.util.Scanner;
/**
 * Ejercicio 07: "Generar un algoritmo que permita calcular y mostrar el valor
 * a cancelar de una planilla de luz. Se debe ingresar el valor de costo por 
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
 * tiene edad mayor a 65 años, se debe descontar el 10%."
 * @author Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoKilovatio;
        double Kilovatiosconsumido;
        int edad;
        double subtotal;
        double descuento = 0.0;
        double valorTotal;
        System.out.println("Ingrese el costo de kilovatio: ");
        costoKilovatio = tcl.nextDouble();
        System.out.println("Ingrese los kilovatios consumidos: ");
        Kilovatiosconsumido = tcl.nextDouble();
        System.out.println("Ingrese la edad del usuario: ");
        edad = tcl.nextInt();
        subtotal = costoKilovatio * Kilovatiosconsumido;
        if (edad > 65){
            descuento = subtotal * 0.10;
        }
        valorTotal = subtotal - descuento;
        System.out.println("Subtotal: $ " + subtotal);
        System.out.println("Descuento (10%): $" + descuento);
        System.out.println("El valor total a cancelar es: $" + valorTotal);
        }   
    }
/***
 * EVIDENCIA DEL RUN:
 *run:
Ingrese el costo de kilovatio: 
0.15
Ingrese los kilovatios consumidos: 
200
Ingrese la edad del usuario: 
67
Subtotal: $ 30.0
Descuento (10%): $3.0
El valor total a cancelar es: $27.0
BUILD SUCCESSFUL (total time: 18 seconds)
 */
    