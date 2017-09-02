package sortingalgorithms;

/**
 * Created by himanshu.patwardhan on 27-Aug-17.
 */
public class SelectionSort {

    public int[] doSeletionSort(int[] array){
       for(int i = 0; i < array.length - 1; i++){
           for(int j = i+1;j <= array.length - 1;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
