package algorithms.workout;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    void twoEqualSnowflakes_shouldBeEqual() {
        final Snowflake first = new Snowflake(new int[]{1, 2, 3, 4, 5, 6});
        final Snowflake second = new Snowflake(new int[]{1, 2, 3, 4, 5, 6});

        assertThat(first).isEqualTo(second);
    }

    @Test
    void twoSnowflakes_shouldBeEqualClockwise() {
        final Snowflake first = new Snowflake(new int[]{1, 2, 3, 4, 5, 6});
        final Snowflake second = new Snowflake(new int[]{2, 3, 4, 5, 6, 1});

        assertThat(first).isEqualTo(second);
    }

    @Test
    void twoSnowflakes_shouldBeEqualCounterClockwise() {
        final Snowflake first = new Snowflake(new int[]{1, 2, 3, 4, 5, 6});
        final Snowflake second = new Snowflake(new int[]{1, 6, 5, 4, 3, 2});

        assertThat(first).isEqualTo(second);
    }

    @Test
    void twoSnowflakesWithRepeatingNumbers_shouldBeEqualClockwise() {
        final Snowflake first = new Snowflake(new int[]{2, 1, 1, 1, 1, 1});
        final Snowflake second = new Snowflake(new int[]{1, 1, 1, 1, 1, 2});

        assertThat(first).isEqualTo(second);
    }
}