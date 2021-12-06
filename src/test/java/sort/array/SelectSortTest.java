package sort.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ly
 * 2021/12/6 21:08
 **/
class SelectSortTest {

    @Test
    public void sort() {
        int[] arr = new int[]{3, 5, 2, 1, 78, 4, 33};
        SelectSort selectSort = new SelectSort();
        selectSort.sort(arr);
        selectSort.print(arr);
        selectSort.isSorted(arr);
    }
}