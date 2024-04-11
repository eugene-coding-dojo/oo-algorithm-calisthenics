package io.github.nergalperm;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Entrypoint> entrypoints = new HashMap<>();

    static {
       // Is empty for now
    }

    public static void main(String[] args) {
        if (args.length==0) {
            System.out.println("Need to pass the ID of the problem");
            return;
        }
        String problemId = args[0];
        entrypoints.getOrDefault(
            problemId,
            () -> System.out.printf("There is no problem with id: %s%n", problemId)
        ).run();
    }

    public interface Entrypoint {
        void run();
    }
}