package sort.array;

import sort.ArraySortI;

/**
 * 冒泡排序
 * 每次相邻的2个元素进行比较，如果前一个比后一个大，则交换
 */
public class BubbleSort implements ArraySortI {
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    exch(array, j-1, j);
                }
            }
        }
    }
}
