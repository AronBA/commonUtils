package string;


import dev.aronba.commonutils.string.Line;
import dev.aronba.commonutils.string.Text;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void textConstructorThrowsExceptionForNullContent() {
        assertThrows(NullPointerException.class, () -> new Text(null));
    }

    @Test
    void textGetContentReturnsCorrectContent() {
        Text text = new Text("Hello\nWorld");
        assertEquals("Hello\nWorld", text.getContent());
    }

    @Test
    void textGetLinesReturnsCorrectLines() {
        Text text = new Text("Hello\nWorld");
        Line[] lines = text.getLines();
        assertEquals(2, lines.length);
        assertEquals("Hello", lines[0].getContent());
        assertEquals("World", lines[1].getContent());
    }

    @Test
    void textGetLineCountReturnsCorrectCount() {
        Text text = new Text("Hello\nWorld");
        assertEquals(2, text.getLineCount());
    }

    @Test
    void textGetLineReturnsCorrectLine() {
        Text text = new Text("Hello\nWorld");
        assertEquals("World", text.getLine(2).getContent());
    }

    @Test
    void textEqualsAndHashCodeWorkCorrectly() {
        Text text1 = new Text("Hello\nWorld");
        Text text2 = new Text("Hello\nWorld");
        assertEquals(text1, text2);
        assertEquals(text1.hashCode(), text2.hashCode());
    }
}