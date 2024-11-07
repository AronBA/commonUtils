package string;


import dev.aronba.commonutils.string.Line;
import dev.aronba.commonutils.string.Word;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void lineConstructorThrowsExceptionForNullContent() {
        assertThrows(NullPointerException.class, () -> new Line(null));
    }

    @Test
    void lineGetContentReturnsCorrectContent() {
        Line line = new Line("Hello World");
        assertEquals("Hello World", line.getContent());
    }

    @Test
    void lineGetWordsReturnsCorrectWords() {
        Line line = new Line("Hello World");
        Word[] words = line.getWords();
        assertEquals(2, words.length);
        assertEquals("Hello", words[0].toString());
        assertEquals("World", words[1].toString());
    }

    @Test
    void lineGetWordCountReturnsCorrectCount() {
        Line line = new Line("Hello World");
        assertEquals(2, line.getWordCount());
    }

    @Test
    void lineGetWordReturnsCorrectWord() {
        Line line = new Line("Hello World");
        assertEquals("Hello", line.getWord(1).toString());
    }

    @Test
    void lineEqualsAndHashCodeWorkCorrectly() {
        Line line1 = new Line("Hello World");
        Line line2 = new Line("Hello World");
        assertEquals(line1, line2);
        assertEquals(line1.hashCode(), line2.hashCode());
    }
}