package clase4;

import java.io.*;
import java.util.Scanner;

public class CodificarDecodificar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leer la entrada del usuario
        System.out.print("¿Desea codificar o decodificar? (c/d): ");
        String action = input.nextLine().toLowerCase();
        System.out.print("Ingrese el valor de desplazamiento: ");
        int shift = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la ruta del archivo de entrada: ");
        String inputPath = input.nextLine();
        System.out.print("Ingrese la ruta del archivo de salida: ");
        String outputPath = input.nextLine();

        // Realizar la codificación o decodificación
        try {
            FileReader reader = new FileReader(inputPath);
            FileWriter writer = new FileWriter(outputPath);
            int character;
            while ((character = reader.read()) != -1) {
                if (action.equals("c")) {
                    character = caesarCipherEncode(character, shift);
                } else {
                    character = caesarCipherDecode(character, shift);
                }
                writer.write(character);
            }
            reader.close();
            writer.close();
            System.out.println("La operación se realizó correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    // Función para codificar un carácter usando el cifrado César
    public static int caesarCipherEncode(int character, int shift) {
        if (Character.isUpperCase(character)) {
            return (character + shift - 65) % 26 + 65;
        } else if (Character.isLowerCase(character)) {
            return (character + shift - 97) % 26 + 97;
        } else {
            return character;
        }
    }

    // Función para decodificar un carácter usando el cifrado César
    public static int caesarCipherDecode(int character, int shift) {
        if (Character.isUpperCase(character)) {
            return (character - shift - 65 + 26) % 26 + 65;
        } else if (Character.isLowerCase(character)) {
            return (character - shift - 97 + 26) % 26 + 97;
        } else {
            return character;
        }
    }
}
