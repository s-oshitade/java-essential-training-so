package com.company;

public class CompareStringValues {

    public static void main(String[] args) {
        String s1 = "Hello!"; //declared with explicit typing
        var s2 = "Hello!"; //declared with an inferred type

        if (s1 == s2) { //This is the wrong way to do it! Although it appears to work with primitive values due to interning.
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        String s3 = new String("Hello!"); //unlike s1 and s2, s3 and s4 are objects. They're not primitive values.
        String s4 = new String("Hello!");
        if (s3 == s4) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        if (s3.equals(s4)) { //This is the right way to compare strings.
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

        var s5 = "HELLO!";
        if (s3.equalsIgnoreCase(s5)) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }
       //The thing to take from this exercise is that the double equals operator, when used with object variables, asks the question, do these two reference variables reference the same object in memory? But when you're comparing strings, that's not the question you're interested in. You're asking whether the two values match.

    }
}
