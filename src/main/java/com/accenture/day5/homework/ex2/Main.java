package com.accenture.day5.homework.ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateSumOfFirstNIntegerNumbers(3));
        System.out.println(calculateSumOfFirstNEvenIntegers(6));
        System.out.println(recursiveStringReversal("Hello"));
        System.out.println(recursiveStringReversal2("Hello"));
        System.out.println(recursivePalindrome("racecar"));
        System.out.println(recursivePalindrome("racecar2"));
        System.out.println(sumOfDigits(1203));
        System.out.println(fibonacci(5));

    }

    private static int calculateSumOfFirstNIntegerNumbers(int n) {
        if (n == 0) {
            return n;
        }
        return n + calculateSumOfFirstNIntegerNumbers(n - 1);
    }

    private static int calculateSumOfFirstNEvenIntegers(int n) {
        if (n == 0) {
            return n;
        }
        if (n % 2 == 0) {
            return n + calculateSumOfFirstNEvenIntegers(n - 1);
        }
        return calculateSumOfFirstNEvenIntegers(n - 1);
    }

    private static String recursiveStringReversal(String str) {
        if (str.length() == 0) {
            return str;
        }
        return recursiveStringReversal(str.substring(1)) + str.charAt(0);
    }

    private static String recursiveStringReversal2(String str) {
        if (str.length() == 0) {
            return str;
        }
        return str.charAt(str.length() - 1) + recursiveStringReversal2(str.substring(0, str.length() - 1));
    }

    private static boolean recursivePalindrome(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() == 0) {
            return true;
        }
        if (str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return recursivePalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }

    private static int sumOfDigits(int n) {
        if (n == 0) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


