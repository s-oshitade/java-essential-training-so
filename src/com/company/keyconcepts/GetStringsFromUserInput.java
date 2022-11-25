package com.company.keyconcepts;

import java.util.Scanner;

public class GetStringsFromUserInput {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in); //The first step is to create an instance of the Scanner class.

        System.out.print("Enter a value: ");
        var input = scanner.nextLine();
        System.out.println(input);

        System.out.print("Enter number 1: ");
        var number1 = scanner.nextInt(); // This will crash if a non-integer is entered. Error handling is necessary here.
        System.out.print("Enter number 2: ");
        var number2 = scanner.nextInt();

        var sum = number1 + number2;
        System.out.println("The sum is " + sum);
    }
}
