package sortingalgorithms;

/**
 * Created by himanshu.patwardhan on 02-Sep-17.
 */
public class TestMergeSort {

    public static void main(String[] args) {
        int[] array = {0, 5, 3, 7, 8, 2, 9, 6, 4, 1};
        MergeSort mergeSort = new MergeSort();
        mergeSort.doMergeSort(array);
        for (int i : array) {
            System.out.println(array[i]);
        }
    }
}
