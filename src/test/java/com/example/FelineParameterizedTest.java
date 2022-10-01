package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class FelineParameterizedTest {

    private final int kittensCountActual;
    private final int kittensCountExpected;

    public FelineParameterizedTest(int kittensCountActual, int kittensCountExpected) {
        this.kittensCountActual = kittensCountActual;
        this.kittensCountExpected = kittensCountExpected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getKittensCountData() {
        return new Object[][]{
                {1, 1},
                {223432, 223432},
                {334, 334},
                {432, 432},
                {245435, 245435},
                {0, 0},
        };
    }

    @Test
    public void getKittensTestParametrized() {
        Feline feline = new Feline();
        int result = feline.getKittens(kittensCountActual);
        Assert.assertEquals(kittensCountExpected, result);
    }
}
