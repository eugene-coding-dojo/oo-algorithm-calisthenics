package io.github.nergalperm.foodlines;

import io.github.nergalperm.utils.Reporter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TextbookAlgorithmTest {
    @Test
    void shouldSolve() {
        final Foodlines foodlines = new Foodlines(new int[]{2, 3, 5});
        new People(5).joinLines(foodlines);

        final AssertionReporter reporter = new AssertionReporter(
            List.of("2", "3", "3", "4", "4"));
        foodlines.reportHistory(reporter);
        assertThat(reporter.isEmpty()).isTrue();
    }

    static class AssertionReporter implements Reporter {
        private final Deque<String> assertions = new ArrayDeque<>();

        public AssertionReporter(List<String> assertions) {
            this.assertions.addAll(assertions);
        }

        @Override
        public void reportNextElement(String element) {
            assertThat(element).isEqualTo(assertions.pollFirst());
        }

        public boolean isEmpty() {
            return this.assertions.isEmpty();
        }
    }
}