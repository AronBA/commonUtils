package string;

import dev.aronba.commonutils.string.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isNullOrEmptyReturnsTrueForNull() {
        assertTrue(StringUtils.isNullOrEmpty(null));
    }

    @Test
    void isNullOrEmptyReturnsTrueForEmptyString() {
        assertTrue(StringUtils.isNullOrEmpty(""));
    }

    @Test
    void isNullOrEmptyReturnsFalseForNonEmptyString() {
        assertFalse(StringUtils.isNullOrEmpty("Hello"));
    }

    @Test
    void hasContentReturnsFalseForNull() {
        assertFalse(StringUtils.hasContent(null));
    }

    @Test
    void hasContentReturnsFalseForEmptyString() {
        assertFalse(StringUtils.hasContent(""));
    }

    @Test
    void hasContentReturnsTrueForNonEmptyString() {
        assertTrue(StringUtils.hasContent("Hello"));
    }

    @Test
    void reverseReturnsReversedString() {
        assertEquals("olleH", StringUtils.reverse("Hello"));
    }

    @Test
    void toUpperCaseReturnsUpperCaseString() {
        assertEquals("HELLO", StringUtils.toUpperCase("Hello"));
    }

    @Test
    void toLowerCaseReturnsLowerCaseString() {
        assertEquals("hello", StringUtils.toLowerCase("Hello"));
    }

    @Test
    void capitalizeReturnsCapitalizedString() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    void isPalindromeReturnsTrueForPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
    }

    @Test
    void isPalindromeReturnsFalseForNonPalindrome() {
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void joinReturnsJoinedString() {
        assertEquals("Hello,World", StringUtils.join(",", "Hello", "World"));
    }
}