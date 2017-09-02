package sortingalgorithms;

/**
 * Created by himanshu.patwardhan on 02-Sep-17.
 */
public class InsertionSort {

    public int[] doInsertionSort(int[] array){
        int element;
        for(int i = 1;i < array.length; i++){
            System.out.println("Roound "+i+"\n");
            for(int k = 0;k < array.length; k++ ) {
                System.out.print(array[k]+" ");
            }
            System.out.println("\n____________________________________________________________________________________________");
            element = array[i];
            for(int j = i-1; j >= 0; j--){
                if(array[j] > element) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    element = array[j];
                }else{
                    break;
                }

            }
        }
        return array;
    }
}
