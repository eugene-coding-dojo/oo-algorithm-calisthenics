package algorithms.workout;

import algorithms.workout.foodlines.Foodlines;
import algorithms.workout.foodlines.People;
import java.util.Scanner;

public class Main {
    private static final ConsoleReader read = new ConsoleReader();
    private static final ConsoleWriter write = new ConsoleWriter();

    public static void main(String[] args) {
        final int[] firstLine = read.asIntArray();

        final int[] lines = read.asIntArray();
        final Foodlines foodlines = new Foodlines(lines);
        final int[] solved = new People(firstLine[1]).join(foodlines);

        write.oneValuePerLine(solved);
    }
}

class ConsoleReader {
    private final Scanner scanner = new Scanner(System.in);

    public String asString() {
        return scanner.nextLine();
    }

    public String[] asStringArray() {
        return scanner.nextLine().split(" ");
    }

    public int asInt() {
        return scanner.nextInt();
    }

    public int[] asIntArray() {
        final String[] input = this.asStringArray();
        final int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }
}

class ConsoleWriter {
    public void singleLine(String value) {
        System.out.println(value);
    }

    public void singleLine(int value) {
        System.out.println(value);
    }

    public void singleLine(String[] values) {
        this.singleLine(String.join(" ", values));
    }

    public void singleLine(int[] values) {
        final String[] stringValues = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            stringValues[i] = Integer.toString(values[i]);
        }
        this.singleLine(stringValues);
    }

    public void oneValuePerLine(String[] values) {
        for (String value : values) {
            this.singleLine(value);
        }
    }

    public void oneValuePerLine(int[] values) {
        for (int value : values) {
            this.singleLine(value);
        }
    }
}