// Pedir dos números y decir cual es el mayor o si son iguales.

package boletín1;

import java.util.Scanner;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        System.out.print("Introduce un numero: ");
        n1 = sc.nextInt();
        System.out.print("Introduce otro numero: ");
        n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            if (n1 > n2) {
                System.out.println(n1 + " es mayor que " + n2);
            } else {
                System.out.println(n2 + " es mayor que " + n1);
            }
        }
    }
}
