package ru.netology;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

// BinaryOperator<Integer> divide = (x, y) -> x / y;  // данная запись формулы плоха, т.к. не предусматривает возможное деление на ноль.
// Что вызовет ошибку RuntimeException.
// Если отталкиваться от того, что Х/0 = бесконечность, в Java тип double поддерживает бесконечность (Double.POSITIVE_INFINITY),
// для Integer аналогом будет MAX_VALUE
    BinaryOperator<Integer> divide = (x, y) -> y == 0 ? Integer.MAX_VALUE : x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
