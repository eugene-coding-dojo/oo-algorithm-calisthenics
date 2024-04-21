package io.github.nergalperm.foodlines;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of lines and number of people: ");
        String[] numbers = scanner.nextLine().split(" ");
        final int n = Integer.parseInt(numbers[0]);
        final int m = Integer.parseInt(numbers[1]);

        System.out.printf("Enter lengths of %d lines: ", n);
        String[] lines = scanner.nextLine().split(" ");
        int[] lineLengths = new int[n];
        for (int i = 0; i < n; i++) {
            lineLengths[i] = Integer.parseInt(lines[i]);
        }

        final int[] solution = solve(n, m, lineLengths);

        for (int i = 0; i < m; i++) {
            System.out.println(solution[i]);
        }
    }

    private static int[] solve(int n, int m, int[] lineLengths) {
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            int shortestIndex = getShortestIndex(lineLengths);
            result[i] = lineLengths[shortestIndex];
            lineLengths[shortestIndex]++;
        }
        return result;
    }

    private static int getShortestIndex(int[] lineLengths) {
        int shortestIndex = 0;
        for (int i = 1; i < lineLengths.length; i++) {
            if (lineLengths[i] < lineLengths[shortestIndex]) {
                shortestIndex = i;
            }
        }
        return shortestIndex;
    }
}
