package dev.aronba.commonutils.algorithm.search;

public class LinearSearch implements SearchingAlgorithm{
    @Override
    public <T extends Comparable<T>> int search(T[] array, T key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }
}
