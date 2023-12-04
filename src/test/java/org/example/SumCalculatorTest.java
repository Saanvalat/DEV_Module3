package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SumCalculatorTest {

    private SumCalculator sumCalculator;
    @BeforeEach
    void sumCalculatorShould() {
        sumCalculator = new SumCalculator();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void sumCalculatorShouldBe() {

        // Given
        int n = 1;

        // When
        int resultOfTest = sumCalculator.sum(n);

        // Then
        Assertions.assertEquals(1, resultOfTest);
    }
    @Test
    void sumCalculatorShouldBe6() {

        // Given
        int n = 3;

        // When
        int resultOfTest = sumCalculator.sum(n);

        // Then
        Assertions.assertEquals(6, resultOfTest);
    }
    @Test
    void sumCalculatorShouldBeIllegalArgumentException() {

        Assertions.assertThrows(IllegalArgumentException.class,() -> {sumCalculator.sum(0);
        });
    }
}