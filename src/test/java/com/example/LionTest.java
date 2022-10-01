package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isLionHaveManePositive() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualResult = lion.doesHaveMane();
        boolean expectedResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void isLionHaveManeNegative() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actualResult = lion.doesHaveMane();
        boolean expectedResult = false;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void LionObjectCreationThrowExceptionTest() throws Exception {
        String incorrectNameOfSex = "sdfsdfsdf";
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            new Lion(incorrectNameOfSex, feline);
        });
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
