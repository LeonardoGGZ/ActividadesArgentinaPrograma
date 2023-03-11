package clase4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumaMultiplicacionArchivo {

    public static void main(String[] args) {

        String rutaArchivo = "";
        String operacion = "";

        Scanner sc = new Scanner(System.in);

        while (true) {

            if (args.length == 2) {
                System.out.println("Se han inicializado el programa con los parametros");
                rutaArchivo = args[0];
                operacion = args[1];

            } else {

                System.out.println("No se han especificado parametros, procediendo a pedir parametros..");
                System.out.println("Ingrese la ruta del archivo txt: ");

                rutaArchivo = sc.nextLine();

            }

            File archivo = null;
            archivo = new File(rutaArchivo);

            if (!archivo.exists()) {
                System.out.println("El archivo especificado no existe, por favor ingrese una ruta valida");

            } else {
                break;
            }

        }

        System.out.println("----Ingrese la operacion----");
        System.out.println("suma");
        System.out.println("multiplicacion");

        operacion = sc.nextLine();

        sc.close();

        int resultado = 0;

        try {
            Scanner scanner = new Scanner(new File(rutaArchivo));

            while (scanner.hasNextInt()) {

                int numero = scanner.nextInt();
                if (operacion.equalsIgnoreCase("suma")) {
                    resultado += numero;
                } else if (operacion.equalsIgnoreCase("multiplicacion")) {
                    if (resultado == 0) {
                        resultado = numero;
                    } else {
                        resultado *= numero;
                    }
                }
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado.");
            return;
        }

        System.out.println("El resultado de la " + operacion + " es: " + resultado);
    }

}
