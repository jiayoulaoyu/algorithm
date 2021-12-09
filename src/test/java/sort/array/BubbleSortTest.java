package sort.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {
        int[] arr = new int[]{3, 5, 2, 1, 78, 4, 33};
        BubbleSort insertSort = new BubbleSort();
        insertSort.sort(arr);
        insertSort.print(arr);
        insertSort.isSorted(arr);
    }
}