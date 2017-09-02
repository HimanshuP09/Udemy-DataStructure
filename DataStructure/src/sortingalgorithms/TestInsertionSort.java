package sortingalgorithms;

/**
 * Created by himanshu.patwardhan on 02-Sep-17.
 */
public class TestInsertionSort {

    public static void main(String[] args) {
        int[] array = {5,2,3,1,7,4,6,9,0,8};
        InsertionSort insertionSort = new InsertionSort();
        array = insertionSort.doInsertionSort(array);
        System.out.println("***********************************Sorted Array**********************************\n");
        for(int k = 0;k < array.length; k++ ) {
            System.out.print(array[k]+" ");
        }
    }
}
