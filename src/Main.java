//package com.company;
import java.util.Arrays;

public class Main {
    public static int findMinimum(int[] arr) {
        int min = arr[0]; // Assume the first element as minimum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
        }

        return min; // Return the minimum value
    }

    public static double calculateAverage(int[] arr) {
        double sum = 0;

        for (int num : arr) {
            sum += num; // Add each element to the sum
        }

        return sum / arr.length; // Return the average
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        return isPrimeRecursive(n, 2); // Start recursion with divisor 2
    }

    private static boolean isPrimeRecursive(int n, int divisor) {
        if (divisor <= Math.sqrt(n)) {
            if (n % divisor == 0) {
                return false; // Found a factor, not prime
            }
            return isPrimeRecursive(n, divisor + 1); // Check next divisor
        }
        return true; // No factors found, prime
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive call for factorial calculation
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: F0 = 0
        } else if (n == 1) {
            return 1; // Base case: F1 = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call for Fibonacci sequence
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case: any number raised to 0 is 1
        }
        return base * power(base, exponent - 1); // Recursive call for exponentiation
    }

    public static void reverseArray(int[] arr) {
        reverseArrayRecursive(arr, 0, arr.length - 1); // Start recursion from both ends
    }

    private static void reverseArrayRecursive(int[] arr, int start, int end) {
        if (start >= end) {
            return; // Base case: reached the middle or invalid range
        }
        // Swap elements at start and end positions
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // Recursive call for inner elements
        reverseArrayRecursive(arr, start + 1, end - 1);
    }

    public static boolean allDigits(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // Found a non-digit character
            }
        }
        return true; // All characters are digits
    }

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base case: C(n, 0) = C(n, n) = 1
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k); // Recursive formula
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: GCD(a, 0) = a
        }
        return gcd(b, a % b); // Recursive call with Euclidean Algorithm
    }




    public static void main(String[] args) {
        int[] numbers = {5, 10, 1, 32, 3, 45, 1};

        // Example usage of the methods
        int min = findMinimum(numbers);
        double avg = calculateAverage(numbers);
        boolean primeCheck = isPrime(7);
        int factorialResult = factorial(5);
        int fibonacciResult = fibonacci(5);
        int powerResult = power(2, 10);
        reverseArray(numbers);
        boolean allDigitsCheck = allDigits("123456");
        int binomialCoefficientResult = binomialCoefficient(7, 3);
        int gcdResult = gcd(32, 48);

        // Print the results
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + avg);
        System.out.println("Is prime: " + primeCheck);
        System.out.println("Factorial: " + factorialResult);
        System.out.println("Fibonacci: " + fibonacciResult);
        System.out.println("Power: " + powerResult);
        System.out.println("Reversed array: " + Arrays.toString(numbers));
        System.out.println("All digits: " + allDigitsCheck);
        System.out.println("Binomial coefficient: " + binomialCoefficientResult);
        System.out.println("GCD: " + gcdResult);
    }
}
