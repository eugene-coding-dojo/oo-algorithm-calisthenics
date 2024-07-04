package algorithms.workout;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static final ConsoleReader read = new ConsoleReader();
    private static final ConsoleWriter write = new ConsoleWriter();

    public static void main(String[] args) {
        final int n = read.asInt();
        final Snowflakes snowflakes = new Snowflakes(n);
        for (int i = 0; i < n; i++) {
            final int[] arms = read.asIntArray();
            snowflakes.add(new Snowflake(arms));
        }

        write.singleLine(snowflakes.uniqueSnowflakesReport());
    }
}

class Snowflakes {
    private final List<Snowflake> snowflakes;

    public Snowflakes(int count) {
        this.snowflakes = new ArrayList<>(count);
    }

    public void add(Snowflake snowflake) {
        this.snowflakes.add(snowflake);
    }

    public String uniqueSnowflakesReport() {
        for (int i = 0; i < snowflakes.size(); i++) {
            for (int j = i + 1; j < snowflakes.size(); j++) {
                if (snowflakes.get(i).equals(snowflakes.get(j))) {
                    return "Twin snowflakes found.";
                }
            }
        }
        return "No two snowflakes are alike.";
    }
}

class Snowflake {
    private final int[] arms;

    public Snowflake(int[] arms) {
        this.arms = arms;
    }

    private String armsClockwise() {
        return IntStream.of(arms)
                   .mapToObj(String::valueOf)
                   .collect(Collectors.joining(" "));
    }

    private String doubleArmsClockwise() {
        return String.join(" ", armsClockwise(), armsClockwise());
    }

    String armsCounterClockwise() {
        return IntStream.of(arms)
                   .mapToObj(String::valueOf)
                   .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                       Collections.reverse(list);
                       return list.stream();
                   }))
                   .collect(Collectors.joining(" "));
    }

    String doubleArmsCounterClockwise() {
        return String.join(" ", armsCounterClockwise(), armsCounterClockwise());
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o==null || getClass()!=o.getClass()) return false;
        Snowflake other = (Snowflake) o;
        return this.doubleArmsClockwise().contains(other.armsClockwise()) ||
               this.doubleArmsCounterClockwise().contains(other.armsClockwise());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arms);
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
        return Integer.parseInt(scanner.nextLine());
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