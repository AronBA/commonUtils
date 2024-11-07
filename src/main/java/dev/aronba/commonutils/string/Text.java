package dev.aronba.commonutils.string;

import java.util.Objects;

/**
 * Immutable representation of a Text with utility functions.
 */
public class Text {
    private final String content;
    private final Line[] lines;

    /**
     * Constructs a new Text object with the given content.
     *
     * @param content the content of the text
     * @throws NullPointerException if the content is null
     */
    public Text(final String content) {
        Objects.requireNonNull(content);
        this.content = content;
        lines = parseLines();
    }

    public Word getWordAtPosition(Position position){
        Line line = getLine(position.line());
        return line.getWordAtColumn(position.column());
    }
    public Word getWordAtPosition(int line, int column){
        return getWordAtPosition(new Position(line,column));
    }

    /**
     * Returns the lines of the text.
     *
     * @return an array of Line objects
     */
    public Line[] getLines() {
        return lines;
    }

    /**
     * Returns the line at the specified position.
     *
     * @param line the line number (1-based index)
     * @return the Line object at the specified position
     * @throws ArrayIndexOutOfBoundsException if the line number is out of range
     */
    public Line getLine(int line) {
        return lines[line - 1];
    }

    /**
     * Returns the number of lines in the text.
     *
     * @return the number of lines
     */
    public int getLineCount() {
        return lines.length;
    }

    /**
     * Returns the content of the text.
     *
     * @return the content as a String
     */
    public String getContent() {
        return content;
    }

    private Line[] parseLines() {
        String[] l = this.content.split("\n");
        Line[] l2 = new Line[l.length];
        for (int i = 0; i < l2.length; i++) {
            l2[i] = new Line(l[i]);
        }
        return l2;
    }

    @Override
    public String toString() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(content, text.content);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(content);
    }
}