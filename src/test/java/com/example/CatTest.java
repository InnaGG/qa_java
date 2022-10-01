package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
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

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedResultList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResultList = cat.getFood();
        Assert.assertEquals(expectedResultList, actualResultList);
    }

}