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
}
