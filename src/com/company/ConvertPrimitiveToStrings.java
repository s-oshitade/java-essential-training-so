package com.company;

public class ConvertPrimitiveToStrings {
    public static void main(String[] args) {
        int result = 10 + 12;
        String answer = "The answer is " + result;
        System.out.println(answer);

//        String howMany = 20 + " things";
        //You can also use inferred typing for the above like so:
        var howMany = 30 + " things"; //This is so similar to JS!
        System.out.println(howMany);

        //You can directly convert primitive values with the wrapper classes
        int intValue = 42;
        var fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        var fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10_000_000;
        var fromLong = Long.toString(longValue);
        System.out.println(fromLong);
    }
}
