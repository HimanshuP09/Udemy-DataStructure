package sortingalgorithms;

/**
 * Created by himanshu.patwardhan on 27-Aug-17.
 */
public class TestSelectionSort {

    public static void main(String[] args) {

        int[] array = {0, 5, 3, 7, 8, 2, 9, 6, 4, 1};
        SelectionSort selectionSort = new SelectionSort();
        array = selectionSort.doSeletionSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
