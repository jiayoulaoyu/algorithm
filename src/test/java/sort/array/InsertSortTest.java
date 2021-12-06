package sort.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ly
 * 2021/12/6 21:33
 **/
class InsertSortTest {

    @Test
    void sort() {
        int[] arr = new int[]{3, 5, 2, 1, 78, 4, 33};
        InsertSort insertSort = new InsertSort();
        insertSort.sort(arr);
        insertSort.print(arr);
        insertSort.isSorted(arr);
    }
}