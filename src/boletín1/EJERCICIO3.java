// Pedir el radio de una circunferencia y calcular su longitud.

package boletín1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double l, r; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        r = sc.nextDouble();
        l = 2 * Math.PI * r;

        System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);
    }
}
