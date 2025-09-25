package cat.inscaparrella;

import java.util.Scanner;

/** Aritmètica segura
 *
 *  Les operacions aritmètiques de nombres grans poden
 *  causar errors de "overflow" i "underflow".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix un nombre: ");
        int a = 0;
        try {
            a = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Error al introduir el nombre!");
            System.exit(-1);
        }

        System.out.println("Introdueix un altre nombre: ");
        int b = 0;
        try {
            b = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Error al introduir el nombre!");
            System.exit(-1);
        }

        int r = 0;
        try {
            r = Math.multiplyExact(a, b);
            System.out.println("El resultat A * B és: \033[0;31m" + r);
            System.exit(0);
        } catch (ArithmeticException e) {
            System.err.println("Resultat massa gran!");
            System.exit(-1);
        }
    }
}