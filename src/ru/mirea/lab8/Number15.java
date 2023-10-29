package ru.mirea.lab8;

public class Number15 {
    public static void main(String[] args) {
        int number = 1989;
        printDigits(number);
    }

    public static void printDigits(int number) {
        if (number < 10) {
            System.out.print(number + " ");
        } else {
            int lastDigit = number % 10;
            System.out.print(lastDigit + " ");
            printDigits(number / 10);
        }
    }
}
