package strings;

import org.junit.Test;
import strings.StringRotation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringRotationTest {

    @Test
    public void testAreRotations_successful() {
        assertTrue(StringRotation.equalRotate("abcde", "cdeab"));
    }

    @Test
    public void testAreRotations_nullInput() {
        assertFalse(StringRotation.equalRotate(null, "test"));
        assertFalse(StringRotation.equalRotate("test", null));
        assertFalse(StringRotation.equalRotate(null, null));
    }

    @Test
    public void testAreRotations_differentLength() {
        assertFalse(StringRotation.equalRotate("hello", "world"));
    }

    @Test
    public void testAreRotations_notRotations() {
        assertFalse(StringRotation.equalRotate("hello", "holla"));
    }

    @Test
    public void testAreRotations_zeroInput() {
        assertTrue(StringRotation.equalRotate("", ""));
    }
}