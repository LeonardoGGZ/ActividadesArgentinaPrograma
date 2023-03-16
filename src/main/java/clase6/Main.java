/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase6;

/**
 *
 * @author Leo
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestCalculadora.class);

        for (org.junit.runner.notification.Failure failure : result.getFailures()) {
            System.out.println("Caso de prueba fallido: " + failure.getDescription().getDisplayName());
            System.out.println("Motivo del fallo: " + failure.getMessage());
            System.out.println("-------------------------------------------");
        }

        if (result.wasSuccessful()) {
            System.out.println("Todos los casos de prueba han sido exitosos.");
        } else {
            System.out.println("Algunos casos de prueba han fallado.");
        }

        System.out.println("Total de casos de prueba ejecutados: " + result.getRunCount());
        System.out.println("Total de casos de prueba exitosos: " + result.getRunCount() 
                           + " - " + result.getFailureCount() + " = " + result.getRunCount() 
                           + result.getFailureCount());
        System.out.println("Total de casos de prueba fallidos: " + result.getFailureCount());
        System.out.println("Tiempo total de ejecución: " + result.getRunTime() + "ms");
    }
}