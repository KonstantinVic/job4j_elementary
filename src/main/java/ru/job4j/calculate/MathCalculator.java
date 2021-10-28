package ru.job4j.calculate;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractionAndDivision(double first, double second) {
        return subtraction(first, second)
        + division(first, second);
    }

    public static double sumAndMultiplyAndSubtractionAndDivision(double first, double second, double third, double fourth) {
        return sumAndMultiply(first, second)
                + subtractionAndDivision(third, fourth);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractionAndDivision(30, 10));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubtractionAndDivision(10, 20, 30, 10));

    }
}