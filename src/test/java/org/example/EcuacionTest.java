package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EcuacionTest {

    Ecuacion ecuacion = new Ecuacion();

    @Test
    public void solucionaEcuacionConMenos() {

        Double result = ecuacion.obtenerResultado("2x - 1 = 0");

        Double valueExpected = 0.5;

        assertEquals(valueExpected, result);
    }

    @Test
    public void solucionaEcuacionConMas() {

        Double result = ecuacion.obtenerResultado("2x + 1 = 0");

        Double valueExpected = -0.5;

        assertEquals(valueExpected, result);
    }

    @Test
    public void solucionaEcuacionConParte3Mayor0() {

        Double result = ecuacion.obtenerResultado("2x + 1 = 10");

        Double valueExpected = 4.5;

        assertEquals(valueExpected, result);
    }


}