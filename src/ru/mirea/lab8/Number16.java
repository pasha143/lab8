package ru.mirea.lab8;
import java.util.Scanner;

public class Number16 {
    public static void main(String[] args) {
        int max = findMax();
        System.out.println(max);
    }

    public static int findMax() {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int number;

        do {
            number = scanner.nextInt();

            if (number != 0 && number > max) {
                max = number;
            }
        } while (number != 0);

        return max;
    }
}