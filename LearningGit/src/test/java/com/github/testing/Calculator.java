
package com.github.testing;

// A simple calculator program that performs addition, subtraction, multiplication, and division.
public class Calculator {
	
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
    	//打印输出
        System.out.println("This is a simple calculator program.");
        System.out.println("This program will perform the following operations:");
        //这个程序将执行以下操作：
        int num1 = 10;
        int num2 = 5;//定义两个整数

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));
    }
}
