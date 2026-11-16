package com.ibcgos.app;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    private Calculatrice calculatrice;

    @BeforeEach
    void setUp() {
        calculatrice = new Calculatrice();
    }

    @Test
    void testSomme() {
        assertEquals(15.0, calculatrice.somme(10, 5), 0.0001);
    }

    @Test
    void testSoustraction() {
        assertEquals(5.0, calculatrice.soustraction(10, 5), 0.0001);
    }

    @Test
    void testMultiplication() {
        assertEquals(50.0, calculatrice.multiplication(10, 5), 0.0001);
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculatrice.division(10, 5), 0.0001);
    }

    @Test
    void testDivisionParZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculatrice.division(10, 0)
        );
    }

    @Test
    void testPuissance() {
        assertEquals(100.0, calculatrice.puissance(10, 2), 0.0001);
    }

    @Test
    void testModulo() {
        assertEquals(1.0, calculatrice.modulo(10, 3), 0.0001);
    }

    @Test
    void testModuloParZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculatrice.modulo(10, 0)
        );
    }

}
