package ru.mirea.lab8;
import java.util.Scanner;

public class Number17 {
    public static void main(String[] args) {
        int max = findMax();
        System.out.println(max);
    }

    public static int findMax() {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int number;

        do {
            number = scanner.nextInt();

            if (number > max) {
                max = number;
            }
        } while (number != 0);

        return max;
    }
}