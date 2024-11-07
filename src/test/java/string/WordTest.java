package string;


import dev.aronba.commonutils.string.Word;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void wordConstructorThrowsExceptionForNullContent() {
        assertThrows(NullPointerException.class, () -> new Word(null));
    }

    @Test
    void wordToStringReturnsCorrectContent() {
        Word word = new Word("Hello");
        assertEquals("Hello", word.toString());
    }

    @Test
    void wordEqualsAndHashCodeWorkCorrectly() {
        Word word1 = new Word("Hello");
        Word word2 = new Word("Hello");
        assertEquals(word1, word2);
        assertEquals(word1.hashCode(), word2.hashCode());
    }
}