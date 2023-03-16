/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author Leo
 */
public class Calculadora {
    
    public double sumar(double unNumero, double otroNumero) {
        return unNumero + otroNumero;
    }
    
    public double restar(double unNumero, double otroNumero) {
        return unNumero - otroNumero;
    }
    
    public double multiplicar(double unNumero, double otroNumero) {
        return unNumero * otroNumero;
    }
    
    public double dividir(double unNumero, double otroNumero) {
        if (otroNumero == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return unNumero / otroNumero;
    }
}