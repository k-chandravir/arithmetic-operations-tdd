package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticOperationsTest {

    ArithmeticOperations operations = new ArithmeticOperations ();
//    int expectedValue, actualValue;

    @Test
    void toReturnThirteenWhenTenIsAddedToThree(){
        //Arrange
        int expectedValue = 13;

        //Act
        int actualValue = operations.add(10, 3);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnSevenWhenThreeIsSubtractedFromTen(){
        //Arrange
        int expectedValue = 7;

        //Act
        int actualValue = operations.subtract(10, 3);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnMinusSevenWhenTenIsSubtractedFromThree(){
        int expectedValue = -7;

        int actualValue = operations.subtract(3, 10);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnMinusThirtyWhenMinusTenIsMultipliedToThree(){
        int expectedValue = -30;

        int actualValue = operations.multiply(3, -10);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnThirtyWhenMinusTenIsMultipliedToMinusThree(){
        int expectedValue = 30;

        int actualValue = operations.multiply(-3, -10);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnThirtyWhenTenIsMultipliedToThree(){
        int expectedValue = 30;

        int actualValue = operations.multiply(3, 10);

        assertEquals(expectedValue, actualValue);
    }
    @Test
    void toReturnZeroWhenTenIsMultipliedToZero(){
        int expectedValue = 0;

        int actualValue = operations.multiply(0, 10);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnTwoWhenTenIsDividedByFive(){
        int expectedValue = 2;

        int actualValue = operations.divide(10, 5);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnMinusTwoWhenTenIsDividedByMinusFive(){
        int expectedValue = -2;

        int actualValue = operations.divide(10, -5);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnTwoWhenMinusTenIsDividedByMinusFive(){
        int expectedValue = 2;

        int actualValue = operations.divide(-10, -5);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toThrowAnExceptionWhenDividedByZero(){
        assertThrows(ArithmeticException.class, () -> operations.divide(10, 0));
    }
}
