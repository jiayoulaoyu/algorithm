package sort.array;

import org.junit.jupiter.api.Test;

class QuickSortTest {

    @Test
    void sort() {
        int[] arr = new int[]{3, 5, 2, 1, 78, 4, 33};
        QuickSort insertSort = new QuickSort();
        insertSort.sort(arr);
        insertSort.print(arr);
        insertSort.isSorted(arr);
    }
}