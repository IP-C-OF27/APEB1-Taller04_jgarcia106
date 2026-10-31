
import java.util.Scanner;
/**
 * Ejercicio 09: "Desarrolle una solución que determine el estado académico de
 * una persona estudiante en una asignatura universitaria a partir de una 
 * calificación de evaluación continua, una calificación de examen final y un
 * porcentaje de asistencia. La regla institucional establece que:

La asistencia mínima debe alcanzarse para ser evaluado
Existe una nota mínima en el examen final, y
La nota final se calcula combinando evaluación continua y examen final.
La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la nota 
final redondeada a un decimal."
 * @author Jhoel Garcia
 * @version 1.0
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double evaContinua;
        double examenFinal;
        double porcentajeAsis;
        double notalFinal;
        double notaFinalredondeada;
        String estado;
        System.out.println("Ingrese nota evaluación continua: ");
        evaContinua = tcl.nextDouble();
        System.out.println("Ingrese nota examen final: ");
        examenFinal = tcl.nextDouble();
        System.out.println("Ingrese el porcentaje asistencia: ");
        porcentajeAsis = tcl.nextDouble();
        notalFinal = (evaContinua + examenFinal) / 2.0;
        notaFinalredondeada = Math.round(notalFinal * 10.0) / 10.0;
        if (porcentajeAsis < 70){
            estado = "Reprodado por inasistencia";
        }else if (examenFinal < 3.5){
        estado = "Reprobado no alcanza nota minima examen";
    }else if (notaFinalredondeada >= 7.0){
        estado = "Aprobado";
    }else if (notaFinalredondeada >= 4.0){
        estado = "Supletorio";
    }else {
        estado = "Reprobado";
    }
        System.out.println("Notal final: " + notaFinalredondeada);
        System.out.println("Estado académico: " + estado);
    }
}
/***
 * EVIDENCIA DEL RUN:
 *run:
Ingrese nota evaluaci�n continua: 
6.5
Ingrese nota examen final: 
7.0
Ingrese el porcentaje asistencia: 
85
Notal final: 6.8
Estado acad�mico: Supletorio
BUILD SUCCESSFUL (total time: 33 seconds)
*/
    
            
      
                
    