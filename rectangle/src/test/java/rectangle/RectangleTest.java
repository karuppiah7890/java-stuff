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
    @Test void shouldGiveAreaAsZeroWhenLengthIsZeroAndBreadthIsZero() {
        Rectangle rectangle = new Rectangle(0, 0);
        assertEquals(0, rectangle.area());
    }

    @Test void shouldGiveAreaAsOneWhenLengthIsOneAndBreadthIsOne() {
        Rectangle rectangle = new Rectangle(1, 1);
        assertEquals(1, rectangle.area());
    }

    @Test void shouldGiveAreaAsTwoWhenLengthIsOneAndBreadthIsTwo() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(2, rectangle.area());
    }

    @Test void shouldGiveAreaAsTwoWhenLengthIsTwoAndBreadthIsOne() {
        Rectangle rectangle = new Rectangle(2, 1);
        assertEquals(2, rectangle.area());
    }

    @Test void shouldGivePerimeterAsZeroWhenLengthIsZeroAndBreadthIsZero() {
        Rectangle rectangle = new Rectangle(0, 0);
        assertEquals(0, rectangle.perimeter());
    }

    @Test void shouldGivePerimeterAsTwoWhenLengthIsOneAndBreadthIsZero() {
        Rectangle rectangle = new Rectangle(1, 0);
        assertEquals(2, rectangle.perimeter());
    }
}
