import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram anagram;

    @Before
    public void setUp() throws Exception {
    anagram = new Anagram();
    }

    @After
    public void tearDown() throws Exception {
        anagram = null;
    }

    @Test
    public void anagramChecker() throws Exception {
        assertEquals(true, anagram.anagramChecker("dog", "god"));
    }

    @Test
    public void anagramNotAnagramChecker() throws Exception {
        assertNotEquals(true, anagram.anagramChecker("dog", "dod"));
    }

    @Test
    public void anagramStringsAreLongerChecker() throws Exception {
        assertNotEquals(true, anagram.anagramChecker("dog", "dodd"));
    }

}