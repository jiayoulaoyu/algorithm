package sort.array;

import sort.ArraySortI;

/**
 * 选择排序
 * 从数组第二个数据开始，找到最小的数据，于第一个交换
 * 然后在剩余的数组中找最小的数据与第二个交换，依次类推
 * @author ly
 * 2021/12/6 21:00
 **/
public class SelectSort implements ArraySortI {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minI = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minI] > array[j]) {
                    minI = j;
                }
            }
            exch(array, i, minI);
        }
    }

}
