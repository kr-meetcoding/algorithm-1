package chpater9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DailyTemperaturesTest {
    @Test
    public void test() {
        Assertions.assertArrayEquals(DailyTemperatures.dailyTemperatures(
                        new int[] {23, 24, 25, 21, 19, 22, 26, 23}),
                new int[] {1, 1, 4, 2, 1, 1, 0, 0});
    }
}
