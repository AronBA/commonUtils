package dev.aronba.commonutils.algorithm.sort;

public interface SortingAlgorithm {
    <T extends Comparable<T>> T[] sort(final T[] array);
}
