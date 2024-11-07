package dev.aronba.commonutils.string;

import dev.aronba.commonutils.exception.NotImplementedException;

import java.util.Objects;

/**
 * Immutable representation of a Line with utility functions.
 */
public class Line {
    private final String content;
    private final Word[] words;

    /**
     * Constructs a new Line object with the given content.
     *
     * @param content the content of the line
     * @throws NullPointerException if the content is null
     */
    public Line(final String content) {
        Objects.requireNonNull(content);
        this.content = content;
        this.words = parseWords();
    }

    /**
     * Returns the words of the line.
     *
     * @return an array of Word objects
     */
    public Word[] getWords() {
        return words;
    }

    /**
     * Returns the number of words in the line.
     *
     * @return the number of words
     */
    public int getWordCount() {
        return words.length;
    }

    /**
     * Returns the word at the specified position.
     *
     * @param i the word index (0-based index)
     * @return the Word object at the specified position
     * @throws ArrayIndexOutOfBoundsException if the index is out of range
     */
    public Word getWord(int i) {
        return words[i + 1];
    }

    /**
     * Returns the content of the line.
     *
     * @return the content as a String
     */
    public String getContent() {
        return content;
    }

    private Word[] parseWords() {
        String[] w = this.content.split(" ");
        Word[] w2 = new Word[w.length];
        for (int i = 0; i < w2.length; i++) {
            w2[i] = new Word(w[i]);
        }
        return w2;
    }

    @Override
    public String toString() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(content, line.content);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(content);
    }

    public  Word getWordAtColumn(int column) {
        throw new NotImplementedException();
    }
}