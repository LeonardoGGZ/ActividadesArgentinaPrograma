package clase4;

import java.io.BufferedReader;
import java.io.FileReader;

public class OperacionesArchivo {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Debe ingresar la ruta del archivo y la operación (suma o multiplicación)");
            return;
        }

        String archivo = args[0];
        String operacion = args[1];
        int resultado = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                int numero = Integer.parseInt(linea);
                if (operacion.equalsIgnoreCase("suma")) {
                    resultado += numero;
                } else if (operacion.equalsIgnoreCase("multiplicación")) {
                    if (resultado == 0) {
                        resultado = 1;
                    }
                    resultado *= numero;
                } else {
                    System.out.println("La operación ingresada no es válida");
                    return;
                }
            }

            System.out.println("El resultado de la " + operacion + " es: " + resultado);

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
