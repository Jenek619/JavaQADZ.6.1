package ru.netology.javaqamaven.JavaQAMavenDZ6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreeMonthTest {

    @Test
    public void testFreeMonthLimit1() {
        FreeMonth service = new FreeMonth();

        int income = 10000; //Заработано дененг
        int expenses = 3000; //Обязательные траты
        int threshold = 20000; //Деньги на счету
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testFreeMonthLimit2() {
        FreeMonth service = new FreeMonth();

        int income = 100000; //Заработано дененг
        int expenses = 60000; //Обязательные траты
        int threshold = 150000; //Деньги на счету
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}