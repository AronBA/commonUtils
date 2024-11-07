package dev.aronba.commonutils.algorithm.search;

public interface SearchingAlgorithm {
    <T extends Comparable<T>> int search(final T[] array, final T key);
}
