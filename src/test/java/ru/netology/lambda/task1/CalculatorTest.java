package ru.netology.lambda.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class CalculatorTest {

    //task 1 - JUnit
    @ParameterizedTest
    @CsvSource(value = {
            "2, 3, 5",
            "0, 0, 0",
            "-2, -2, -4"
    })
    void plusTest(int a, int b, int expectedResult) {
        //when
        Calculator calculator = Calculator.instance.get();
        int actualResult = calculator.plus.apply(a, b);
        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "0, 5, -5",
            "-3, 4, -7"
    })
    void minusTest(int a, int b, int expectedResult) {
        Calculator calculator = Calculator.instance.get();
        int actualResult = calculator.minus.apply(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "8, 2, 4",
            "5, 0, 0"
    })
    void devideTest(int a, int b, int expectedResult) {
        Calculator calculator = Calculator.instance.get();
        int actualResult = calculator.devide.apply(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1, 1",
            "0, 0",
            "-5, 5"
    })
    void absTest(int a, int expectedResult) {
        Calculator calculator = Calculator.instance.get();
        int actualResult = calculator.abs.apply(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    //task 2 - Hamcrest
    @ParameterizedTest
    @CsvSource(value = {
            "2, 3, 6",
            "4, 0, 0",
            "-5, 5, -25"
    })
    public void multiplyTest(int a, int b, int expectedResult) {
        Calculator calculator = Calculator.instance.get();
        int result = calculator.multiply.apply(a, b);

        assertThat(expectedResult, is(result));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "3, true",
            "-5, false"
    })
    public void isPositiveTest(int value, boolean result) {
        Calculator calculator = Calculator.instance.get();
        boolean a = calculator.isPositive.test(value);
        assertThat(a, is(result));
    }
}