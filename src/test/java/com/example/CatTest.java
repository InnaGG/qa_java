package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);
        String result = cat.getSound();
        String expected = "Мяу";
        Assert.assertEquals("Ожидаемый результат - \"Мяу!\"", expected, result);
    }

}