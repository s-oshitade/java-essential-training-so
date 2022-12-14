package com.company.keyconcepts;

import java.util.Scanner;

public class ReusableCodeWIthMethods {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        double d1 = getInput(sc, "Enter numeric value 1: ");

        double d2 = getInput(sc, "Enter numeric value 2: ");

        double result = d1 / d2;

        System.out.println("The answer is " + result);
    }

    private static double getInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }

}
