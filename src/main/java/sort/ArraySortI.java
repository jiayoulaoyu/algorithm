package sort;

import java.util.Arrays;

/**
 * @author ly
 * 2021/12/6 20:57
 **/
public interface ArraySortI {
    /**
     * 升序
     */
    void sort(int[] array);

    /**
     * 交换
     */
    default void exch(int[] array,int i,int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j] = temp;
    }

    default void isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                throw new RuntimeException("排序错误");
            }
        }
    }

    default void print(int[] array) {
        System.err.println(Arrays.toString(array));
    }
}
