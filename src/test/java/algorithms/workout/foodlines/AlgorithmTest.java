package algorithms.workout.foodlines;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AlgorithmTest {
    @Test
    void shouldFindTheShortestLine() {
        int[] lines = {2, 3, 7};
        int[] expected = {2, 3, 3, 4, 4};
        int[] actual = Algorithm.solve(3, 5, lines);

        assertThat(actual).isEqualTo(expected);
    }
}