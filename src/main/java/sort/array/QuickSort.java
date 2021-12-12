package sort.array;

import sort.ArraySortI;

/**
 * 快速排序
 */
public class QuickSort implements ArraySortI {

    @Override
    public void sort(int[] array) {

        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivotIndex = partition(arr, startIndex, endIndex);
        partition(arr, startIndex, pivotIndex - 1);
        partition(arr, pivotIndex + 1, endIndex);

    }

    private int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[startIndex];//....
        int left = startIndex;
        int right = endIndex;
        while (left != right) {
            while (left < right && arr[right] > pivot) {
                right--;
            }
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            if (left < right) {
                exch(arr, left, right);
            }

        }
        arr[startIndex] = arr[left];
        arr[left] = pivot;
        return left;

    }
}
