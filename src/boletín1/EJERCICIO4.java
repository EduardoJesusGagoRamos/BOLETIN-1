// Pedir dos números y decir si son iguales o no.

package boletín1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EJERCICIO4 {

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
            System.out.println("No son iguales");
        }
    }
}
