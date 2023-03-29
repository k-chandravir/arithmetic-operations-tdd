package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTest {

    ArithmeticOperations arethmeticObject = new ArithmeticOperations ();

    @Test
    void toReturnThirteenWhenTenIsAddedToThree(){
        //Arrange
        int expectedValue = 13;

        //Act
        int actualValue = arethmeticObject.add(10, 3);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnSevenWhenThreeIsSubstractedFromTen(){
        //Arrange
        int expectedValue = 7;

        //Act
        int actualValue = arethmeticObject.subtract(10, 3);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void toReturnMinusSevenWhenTenIsSubtractedFromThree(){
        int expectedValue = -7;

        int actualValue = arethmeticObject.subtract(3, 10);

        assertEquals(expectedValue, actualValue);
    }
}
