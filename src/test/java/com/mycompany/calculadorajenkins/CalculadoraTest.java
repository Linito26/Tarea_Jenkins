package com.mycompany.calculadorajenkins;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void suma_ok() {
        var calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void resta_ok() {
        var calc = new Calculadora();
        assertEquals(3, calc.restar(5, 2));
    }

    @Test
    void multiplicacion_ok() {
        var calc = new Calculadora();
        // Valor correcto esperado: 4 * 3 = 12
        assertEquals(12, calc.multiplicar(4, 3));  // <-- aquí debe FALLAR por tu bug adrede
    }

    @Test
    void division_ok() {
        var calc = new Calculadora();
        // dividir devuelve double; comparamos con delta
        assertEquals(4.0, calc.dividir(8, 2), 1e-9); // <-- aquí también debe FALLAR por tu bug adrede
    }

    @Test
    void division_por_cero_lanza_excepcion() {
        var calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }
}
