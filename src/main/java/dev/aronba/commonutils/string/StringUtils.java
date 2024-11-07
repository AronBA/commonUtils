package dev.aronba.commonutils.string;
/**
 * Utility class for common string operations.
 * <p>
 * This class provides static methods to perform various operations on strings,
 * such as checking if a string is null or empty, reversing a string, converting
 * a string to uppercase or lowercase, capitalizing the first letter of a string,
 * checking if a string is a palindrome, and joining an array of strings with a
 * given delimiter.
 * </p>
 * <p>
 * This class is final and cannot be instantiated.
 * </p>
 */
public final  class StringUtils {

    private StringUtils(){}

    /**
     * Checks if a string is null or empty.
     *
     * @param string the string to check
     * @return true if the string is null or empty, false otherwise
     */
    public static boolean isNullOrEmpty(final String string) {
        return string == null || string.isEmpty();
    }

    /**
     * Checks if a string has content (non-whitespace characters).
     *
     * @param string the string to check
     * @return true if the string has content, false otherwise
     */
    public static boolean hasContent(final String string) {
        String noSpaceString = string.strip();
        return !isNullOrEmpty(noSpaceString);
    }

    /**
     * Reverses the given string.
     *
     * @param string the string to reverse
     * @return the reversed string
     */
    public static String reverse(final String string) {
        if (string == null) {
            return null;
        }
        return new StringBuilder(string).reverse().toString();
    }

    /**
     * Converts the given string to uppercase.
     *
     * @param string the string to convert
     * @return the uppercase string
     */
    public static String toUpperCase(final String string) {
        if (string == null) {
            return null;
        }
        return string.toUpperCase();
    }

    /**
     * Converts the given string to lowercase.
     *
     * @param string the string to convert
     * @return the lowercase string
     */
    public static String toLowerCase(final String string) {
        if (string == null) {
            return null;
        }
        return string.toLowerCase();
    }

    /**
     * Capitalizes the first letter of the given string.
     *
     * @param string the string to capitalize
     * @return the string with the first letter capitalized
     */
    public static String capitalize(final String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    /**
     * Checks if the given string is a palindrome.
     *
     * @param string the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(final String string) {
        if (string == null) {
            return false;
        }
        String reversed = reverse(string);
        return string.equals(reversed);
    }

    /**
     * Joins an array of strings with a given delimiter.
     *
     * @param delimiter the delimiter to use
     * @param strings the array of strings to join
     * @return the joined string
     */
    public static String join(final String delimiter, final String... strings) {
        if (strings == null) {
            return null;
        }
        return String.join(delimiter, strings);
    }
}