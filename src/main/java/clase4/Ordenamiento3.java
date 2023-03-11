package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento3 {

    public static void main(String[] args) {

        int[] numeros = new int[3];
        char orden = 'a';
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 3 números separados por espacios:");
        String input = sc.nextLine();

        if (!input.isEmpty()) {
            String[] numerosStr = input.split(" ");
            for (int i = 0; i < 3; i++) {
                numeros[i] = Integer.parseInt(numerosStr[i]);
            }
            System.out.println("Ingrese 'a' para ordenar ascendente o 'd' para ordenar descendente:");
            orden = sc.nextLine().charAt(0);

        } else {

            System.out.println("Ingrese los numeros a ordenar:");

            // pedir los números de a uno
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese un numero: ");
                while (true) {
                    try {
                        numeros[i] = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Ingrese un número válido");
                    }
                }
            }

            System.out.println("Ingrese 'a' para ordenar ascendente o 'd' para ordenar descendente:");
            orden = sc.nextLine().charAt(0);
        }

        ordenar(numeros, orden);

        System.out.println("Los números ordenados son: " + Arrays.toString(numeros));
    }

    // función que ordena los números
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
        }
    }
}
