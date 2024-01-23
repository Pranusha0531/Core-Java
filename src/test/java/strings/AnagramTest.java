package strings;

import org.junit.Test;
import strings.Anagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

    @Test
    public void testAreAnagrams_successful() {
        assertTrue(Anagram.equalResult("listen", "silent"));
    }

    @Test
    public void testAreAnagrams_nullInput() {
        assertFalse(Anagram.equalResult(null, "test"));
        assertFalse(Anagram.equalResult("test", null));
        assertFalse(Anagram.equalResult(null, null));
    }

    @Test
    public void testAreAnagrams_differentLength() {
        assertFalse(Anagram.equalResult("hello", "world"));
    }

    @Test
    public void testAreAnagrams_notAnagrams() {
        assertFalse(Anagram.equalResult("hello", "holla"));
    }

    @Test
    public void testAreAnagrams_zeroInput() {
        assertTrue(Anagram.equalResult("", ""));
    }
}