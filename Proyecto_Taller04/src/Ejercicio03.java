
import java.util.Scanner;
/**
 * Ejercicio 03: "Se desea desarrollar un algoritmo que permita mostrar la tabla
 * de multiplicar de un número ingresado por el usuario; solo en el caso que el
 * valor del número esté entre 2 y 6. No use aún, ciclos repetitivos."
 * @author Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entre el 2 y 6");
        numero = tcl.nextInt();
        if (numero >= 2 && numero <= 6){
            System.out.println("Tabla de multiplicar del " + numero + ":");
            System.out.println(numero + " * 1 = " + (numero * 1));
            System.out.println(numero + " * 2 = " + (numero * 2));
            System.out.println(numero + " * 3 = " + (numero * 3));
            System.out.println(numero + " * 4 = " + (numero * 4));
            System.out.println(numero + " * 5 = " + (numero * 5));
            System.out.println(numero + " * 6 = " + (numero * 6));
            System.out.println(numero + " * 7 = " + (numero * 7));
            System.out.println(numero + " * 8 = " + (numero * 8));
            System.out.println(numero + " * 9 = " + (numero * 9));
            System.out.println(numero + " * 10 = " + (numero * 10));
            System.out.println(numero + " * 11 = " + (numero * 11));
            System.out.println(numero + " * 12 = " + (numero * 12));
        } else {
            System.out.println("Numero ingresado no esta dentro del rango");
        }
    }  
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese un numero entre el 2 y 6
4
Tabla de multiplicar del 4:
4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
4 * 6 = 24
4 * 7 = 28
4 * 8 = 32
4 * 9 = 36
4 * 10 = 40
4 * 11 = 44
4 * 12 = 48
BUILD SUCCESSFUL (total time: 2 seconds)
* EVIDENCIA DEL RUN
* run:
Ingrese un numero entre el 2 y 6
7
Numero ingresado no esta dentro del rango
BUILD SUCCESSFUL (total time: 2 seconds)
 */
    
