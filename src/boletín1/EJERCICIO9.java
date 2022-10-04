// Pedir dos números y mostrarlos ordenados de mayor a menor.

package boletín1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class EJERCICIO9 {

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

        if (n1 > n2) {
            System.out.println(n1 + " y " + n2);
        } else {
            System.out.println(n2 + " y " + n1);
        }
    }
}
