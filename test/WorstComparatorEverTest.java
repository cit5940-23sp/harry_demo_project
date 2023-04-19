import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class WorstComparatorEverTest {

    @Test
    void compare() {
        Comparator<Integer> tester = new WorstComparatorEver<>();
        assertEquals(-1, tester.compare(4, 5));
    }

    @Test
    void compareBetter() {
        Comparator<Integer> tester = new WorstComparatorEver<>();
        assertEquals(-1 * 1, tester.compare(4, 5));
    }
}