package com.pault.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalcTest{


    @Test
    void twoPlusTwoShouldEqualFour() {
        SimpleCalc calc = new SimpleCalc();
        assertEquals(4, calc.add(2, 2));

    }

    @Test
    void twoPlusTwoShouldNotEqualFour() {
        SimpleCalc calc = new SimpleCalc();
        assertNotEquals(5, calc.add(2, 2));
    }


    @Test
    void threePlusSevenShouldEqualTen() {
        SimpleCalc calc = new SimpleCalc();
        assertEquals(10, calc.add(3, 7));
    }

}