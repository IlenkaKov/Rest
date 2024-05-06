package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        long balance = 0;
        int count = service.calculate(10_000, 3_000, 20_000);
        System.out.println(count);
    }
}
