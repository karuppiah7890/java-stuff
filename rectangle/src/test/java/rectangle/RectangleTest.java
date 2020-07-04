/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package rectangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    // Note how the test function name does not contain
    // numbers like 0, but instead contain words to
    // represent the numbers "Zero"
    @Test void shouldGiveZeroWhenLengthIsZeroAndBreadthIsZero() {
        Rectangle rectangle = new Rectangle(0, 0);
        assertEquals(0, rectangle.area());
    }

    @Test void shouldGiveOneWhenLengthIsOneAndBreadthIsOne() {
        Rectangle rectangle = new Rectangle(1, 1);
        assertEquals(1, rectangle.area());
    }

    @Test void shouldGiveTwoWhenLengthIsOneAndBreadthIsTwo() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(2, rectangle.area());
    }

    @Test void shouldGiveTwoWhenLengthIsTwoAndBreadthIsOne() {
        Rectangle rectangle = new Rectangle(2, 1);
        assertEquals(2, rectangle.area());
    }
}
