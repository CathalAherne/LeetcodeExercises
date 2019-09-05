import org.junit.Test;
import utils.LengthOfLongestSubstring;
import static junit.framework.TestCase.assertEquals;



public class LengthOfLongestSubstringTests {

    @Test
    public void testWithOneChar(){
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("p") , 1 );
    }

    @Test
    public void testWithNoChar(){
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("") , 0 );
    }

    @Test
    public void testWithRepeatingChars(){
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("abcabc") , 3 );
    }

    @Test
    public void testWithMoreThanOneSequence(){
        assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew") , 3 );
    }

    @Test
    public void testWithNoRepeats(){
        assertEquals(2 , LengthOfLongestSubstring.lengthOfLongestSubstring("au"));
    }
}
