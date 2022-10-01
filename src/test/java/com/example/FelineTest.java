package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String result = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getKittensTestMethodWithoutAttributes() {
        Feline feline = new Feline();
        int result = feline.getKittens();
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getKittensTestMethodWithAttributes() {
        Feline feline = new Feline();
        int result = feline.getKittens(1);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> actualResult = feline.eatMeat();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedResult, actualResult);
    }
}
