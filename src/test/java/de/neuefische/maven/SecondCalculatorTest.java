package de.neuefische.maven;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondCalculatorTest {
    @Test
    @DisplayName("When sum of values is")
    public void secondcalculatortest () {
        int sum = SecondCalculator.secondcalculator(2,4);
        assertEquals(6,sum);
    }
    @Test
    @DisplayName("When value is greater than 100 tool should return true")
    void isGreaterThan100test() {

        //GIVEN
        int given = 104;
        //WHEN
        boolean result = SecondCalculator.isGreaterThan100(given);
        //THEN
        assertTrue(result);
    }

    @Test
    @DisplayName("When value is smaller than 100 tool should return false")
    void isNotGreaterThan100test() {

        //GIVEN
        int given = 99;
        //WHEN
        boolean result = SecondCalculator.isGreaterThan100(given);
        //THEN
        assertFalse(result);
    }


}