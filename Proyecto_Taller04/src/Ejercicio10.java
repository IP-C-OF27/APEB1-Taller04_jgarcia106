
import java.util.Scanner;
/**
 * Ejercicio 10: "El programa debe calcular el área del polígono. La figura se
 * compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales 
 * (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
 * rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, 
 * mientras que la altura mide lo mismo que la altura de los triángulos. Se 
 * pide que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula
multiplicando su base por su altura; el área de un triángulo rectángulo se 
calcula multiplicando su base por su altura, y luego dividiendo el resultado
entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado la
medida de uno de sus lados.

La parte interesante de este problema es determinar el mínimo número de datos 
que hay que preguntar. Polígono"
 * @author Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double ladoCuadrado;
        double alturaTriangulo;
        double areaCuadradoA;
        double areaTrianguloBCE;
        double areaRectangulo;
        double areaTotal;
        System.out.println("Ingrese la medida del lado del cuadrado: ");
        ladoCuadrado = tcl.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        alturaTriangulo = tcl.nextDouble();
       // 1. Area del cuadrado A
       areaCuadradoA = Math.pow(ladoCuadrado, 2);
       //2. Area de los tres triangulos
       areaTrianguloBCE = 3 * ((ladoCuadrado * alturaTriangulo) / 2.0);
       //3. Area del rectangulo
       areaRectangulo = ladoCuadrado * alturaTriangulo;
       //4. Area total
       areaTotal = areaCuadradoA + areaTrianguloBCE + areaRectangulo;
        System.out.println("\n--- DESGLOSE DE AREAS ---");
        System.out.println("Area Cuadrado A: " + areaCuadradoA);
        System.out.println("Area de los triangulos B C E: " + areaTrianguloBCE);
        System.out.println("Area rectangulo: " + areaRectangulo);
        System.out.println("El area total es: " + areaTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *run:
Ingrese la medida del lado del cuadrado: 
4
Ingrese la altura del triangulo: 
3

--- DESGLOSE DE AREAS ---
Area Cuadrado A: 16.0
Area de los triangulos B C E: 18.0
Area rectangulo: 12.0
El area total es: 46.0
BUILD SUCCESSFUL (total time: 12 seconds)
*/

    
                

