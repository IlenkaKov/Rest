package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.RestService;

public class RestServicesTest {
    @Test
    void month1() {
        RestService service = new RestService();
        long balance = 0;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month2() {
        RestService service = new RestService();
        long balance = 7_000;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void month3() {
        RestService service = new RestService();
        long balance = 14_000;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month4() {
        RestService service = new RestService();
        long balance = 21_000;
        int income = 0;
        int expenses = (3_000+12_000);
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month5() {
        RestService service = new RestService();
        long balance = 6_000;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month6() {
        RestService service = new RestService();
        long balance = 13_000;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month7() {
        RestService service = new RestService();
        long balance = 20_000;
        int income = 0;
        int expenses = (3_000 + 11_334);
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month8() {
        RestService service = new RestService();
        long balance = 5_666;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month9() {
        RestService service = new RestService();
        long balance = 12_666;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month10() {
        RestService service = new RestService();
        long balance = 19_666;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month11() {
        RestService service = new RestService();
        long balance = 26_666;
        int income = 0;
        int expenses = (3_000 + 15_778);
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void month12() {
        RestService service = new RestService();
        long balance = 7_888;
        int income = 10_000;
        int expenses = 3_000;
        int treshold = 20_000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        //System.out.println(count);
        Assertions.assertEquals(expected, actual);
    }
}
