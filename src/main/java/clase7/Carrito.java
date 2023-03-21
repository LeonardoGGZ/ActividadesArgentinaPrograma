/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import clase5.*;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<ItemCarrito> items;

    public Carrito() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemCarrito item) {

        if (items.size() < 3) {

            items.add(item);

        } else {
            System.out.println("No se pueden agregar más de 3 productos al carrito.");
        }
    }

    public double getPrecio() {
        double total = 0.0;
        for (ItemCarrito item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public double getPrecioConDescuento(Descuento descuento) {
        double total = getPrecio();
        return descuento.aplicarDescuento(total);
    }
}
