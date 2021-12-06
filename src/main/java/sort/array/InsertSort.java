package sort.array;

import sort.ArraySortI;

/**
 * 选择排序
 * <p>
 * 将选中的数据插入到一个有序集合中
 *
 *
 * @author ly
 * 2021/12/6 21:29
 **/
public class InsertSort implements ArraySortI {

    @Override
    public void sort(int[] array) {
        int len = array.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                exch(array, j - 1, j);
            }
        }
    }

}
