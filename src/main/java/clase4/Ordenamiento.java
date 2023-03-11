package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento {

    public static void main(String[] args) {
        int[] numeros = new int[3];
        char orden = 'a';

        if (args.length >= 4) {
            for (int i = 0; i < 3; i++) {
                numeros[i] = Integer.parseInt(args[i]);
            }
            orden = args[3].charAt(0);
        } else {

            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese 3 números separados por espacios:");
            String input = sc.nextLine();
            String[] numerosStr = input.split(" ");
            for (int i = 0; i < 3; i++) {
                numeros[i] = Integer.parseInt(numerosStr[i]);
            }
            System.out.println("Ingrese 'a' para ordenar ascendente o 'd' para ordenar descendente:");
            orden = sc.nextLine().charAt(0);
        }

        ordenar(numeros, orden);

        System.out.println(Arrays.toString(numeros));
    }

    public static void ordenar(int[] numeros, char orden) {
        if (orden == 'a') {
            Arrays.sort(numeros);
        } else if (orden == 'd') {
            Arrays.sort(numeros);
            for (int i = 0; i < numeros.length / 2; i++) {
                int temp = numeros[i];
                numeros[i] = numeros[numeros.length - 1 - i];
                numeros[numeros.length - 1 - i] = temp;
            }
        } else {
            System.out.println("Orden inválido. Se ordenará ascendente por defecto.");
            Arrays.sort(numeros);
        }
    }

}
