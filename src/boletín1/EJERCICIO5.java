// Pedir un número e indicar si es positivo o negativo.

package boletín1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("Negativo");
        } else {
            //suponemos que el 0 es positivo.
            System.out.println("Positivo");
        }

    }

}
