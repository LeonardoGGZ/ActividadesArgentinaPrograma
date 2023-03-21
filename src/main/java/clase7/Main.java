/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import clase5.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String archivo = "C:\\Users\\leona\\Documents\\NetBeansProjects\\TrabajosMaven\\src\\main\\java\\resources\\carrito.txt"; // ruta del archivo de texto
        
        // Crear objeto Carrito
        Carrito carrito = new Carrito();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int contadorLineas = 0;
            while ((linea = br.readLine()) != null) {
                if (contadorLineas > 0) { // saltar la primera línea que tiene las cabeceras
                    String[] campos = linea.split(", ");
                    int cantidad = Integer.parseInt(campos[0]);
                    double precio = Double.parseDouble(campos[1]);
                    String nombreProducto = campos[2];
                    
                    // Crear objeto Producto
                    Producto producto = new Producto(nombreProducto, precio);
                    
                    // Crear objeto ItemCarrito
                    ItemCarrito item = new ItemCarrito(producto, cantidad);
                    
                    // Agregar item al carrito
                    carrito.agregarItem(item);
                }
                contadorLineas++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Imprimir precio total del carrito sin descuento
        System.out.println("Precio total sin descuento: " + carrito.getPrecio());
        
        // Imprimir precio total del carrito con descuento del 10%
        Descuento descuento10 = new DescuentoPorcentaje(10);
        double precioConDescuento = carrito.getPrecioConDescuento(descuento10);
        System.out.println("Precio total con descuento del 10%: " + precioConDescuento);
    }
}