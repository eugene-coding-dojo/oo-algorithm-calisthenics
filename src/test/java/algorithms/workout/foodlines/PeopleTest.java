package algorithms.workout.foodlines;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PeopleTest {
    @Test
    void shouldFindTheShortestLine() {
        int[] lines = {2, 3, 7};
        int[] expected = {2, 3, 3, 4, 4};
        int[] actual = new People(5).join(lines);

        assertThat(actual).isEqualTo(expected);
    }
}