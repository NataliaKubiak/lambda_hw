package ru.netology.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        //не работает потому что тут возникает ошибка "деление на ноль"
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException ae) {
            System.out.println("Вы пытаетесь разделить на 0. Введите любое другое число в знаменатель");
        }
    }
}
