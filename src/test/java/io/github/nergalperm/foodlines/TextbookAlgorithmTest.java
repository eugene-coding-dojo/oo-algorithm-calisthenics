package io.github.nergalperm.foodlines;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TextbookAlgorithmTest {
    @Test
    void shouldSolve() {
        final int[] actual = TextbookAlgorithm.solve(3, 5, new int[]{2, 3, 5});
        assertThat(actual).containsExactly(2, 3, 3, 4, 4);
    }
}