package algorithm.search;

import dev.aronba.commonutils.algorithm.search.LinearSearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void searchFindsElementInArray() {
        LinearSearch linearSearch = new LinearSearch();
        Integer[] array = {1, 2, 3, 4, 5};
        int result = linearSearch.search(array, 3);
        assertEquals(2, result);
    }

    @Test
    void searchReturnsMinusOneWhenElementNotFound() {
        LinearSearch linearSearch = new LinearSearch();
        Integer[] array = {1, 2, 3, 4, 5};
        int result = linearSearch.search(array, 6);
        assertEquals(-1, result);
    }

    @Test
    void searchReturnsMinusOneForEmptyArray() {
        LinearSearch linearSearch = new LinearSearch();
        Integer[] array = {};
        int result = linearSearch.search(array, 1);
        assertEquals(-1, result);
    }

    @Test
    void searchFindsElementAtFirstPosition() {
        LinearSearch linearSearch = new LinearSearch();
        Integer[] array = {1, 2, 3, 4, 5};
        int result = linearSearch.search(array, 1);
        assertEquals(0, result);
    }

    @Test
    void searchFindsElementAtLastPosition() {
        LinearSearch linearSearch = new LinearSearch();
        Integer[] array = {1, 2, 3, 4, 5};
        int result = linearSearch.search(array, 5);
        assertEquals(4, result);
    }

    @Test
    void searchHandlesNullArray() {
        LinearSearch linearSearch = new LinearSearch();
        Integer[] array = null;
        assertThrows(NullPointerException.class, () -> linearSearch.search(array, 1));
    }

    @Test
    void searchHandlesNullKey() {
        LinearSearch linearSearch = new LinearSearch();
        Integer[] array = {1, 2, 3, 4, 5};
        assertThrows(NullPointerException.class, () -> linearSearch.search(array, null));
    }
}