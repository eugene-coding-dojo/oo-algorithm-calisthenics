package io.github.nergalperm.utils;

public class ConsoleLinesReporter implements Reporter {
    @Override
    public void reportNextElement(String element) {
        System.out.println(element);
    }
}
