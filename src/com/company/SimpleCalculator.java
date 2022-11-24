package com.company;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter a numeric value: ");
        var input1 = scanner.nextDouble();

        System.out.print("Enter a numerical value: ");
        var input2 = scanner.nextDouble();

        double quotient = input1/input2;
        System.out.println(quotient);
    }
}
