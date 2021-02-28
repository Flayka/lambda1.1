package ru.netology;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.divide.apply(a, b);
            calc.println.accept(c);
        } catch (RuntimeException e) {
            System.out.println("Division by zero: " + e);
        }

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        if (b != 0) {
            int c = calc.divide.apply(a, b);
            calc.println.accept(c);
        } else {
            System.out.println("Division by zero");
        }
    }
}
