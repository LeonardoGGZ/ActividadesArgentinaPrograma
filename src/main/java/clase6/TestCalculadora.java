package clase6;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class TestCalculadora {

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        double resultado = calc.multiplicar(80, 3);
        double esperado = 240;
        assertEquals(esperado, resultado, 0);
    }
    
    @Test
    public void testSumarYDividir() {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar(150, 180) / 3;
        double esperado = 110;
        assertEquals(esperado, resultado, 0);
    }
    
    @Test
    public void testRestarYMultiplicar() {
        Calculadora calc = new Calculadora();
        double resultado = calc.restar(90, 50) * 15;
        double no_esperado = 605;
        assertNotEquals(no_esperado, resultado, 0);
    }
    
    @Test
    public void testSumarYMultiplicar() {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar(70, 40) * 25;
        double no_esperado = 2700;
        assertNotEquals(no_esperado, resultado, 0);
    }
}