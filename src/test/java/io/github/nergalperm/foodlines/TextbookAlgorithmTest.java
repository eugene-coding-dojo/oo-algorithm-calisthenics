package io.github.nergalperm.foodlines;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TextbookAlgorithmTest {
    @Test
    void shouldSolve() {
        final List<Integer> actual = new People(5).joinLines(new Foodlines(new int[]{2, 3, 5}));
        assertThat(actual).containsExactly(2, 3, 3, 4, 4);
    }
}