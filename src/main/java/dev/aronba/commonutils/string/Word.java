package dev.aronba.commonutils.string;

import java.util.Objects;

/**
 * Immutable representation of a Word with utility functions.
 */
public class Word {
    private final String content;

    /**
     * Constructs a new Word object with the given content.
     *
     * @param content the content of the word
     * @throws NullPointerException if the content is null
     */
    public Word(final String content) {
        Objects.requireNonNull(content);
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(content, word.content);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(content);
    }
}