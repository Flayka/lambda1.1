package ru.netology;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);

        int d = calc.multiply.apply(a, a);
        calc.println.accept(d);

        int e = calc.pow.apply(d);
        calc.println.accept(e);

        int f = calc.abs.apply(-17);
        calc.println.accept(f);

        System.out.println(calc.isPositive.test(e));

    }
}
