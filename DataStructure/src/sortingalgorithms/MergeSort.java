package sortingalgorithms;

/**
 * Created by himanshu.patwardhan on 02-Sep-17.
 */
public class MergeSort {

    public void doMergeSort(int[] array){

        int first = 0;
        int last = array.length-1;
        doSplit(array,first,last);
    }

    private void doSplit(int[] array, int first, int last) {
            if(last <= first){
                return;
            }
            int mid = (first + last) / 2;
            doSplit(array, first, mid);
            doSplit(array, mid + 1, last);
            merge(array, first, mid, last);
    }

    private void merge(int[] array, int first, int mid, int last) {
        int[] tempArray = new int[(last - first) + 1];
        int leftSlot = first;
        int rightSlot = mid + 1;
        int k = 0;
        while(leftSlot <= mid && rightSlot <= last){
            if(array[leftSlot] < array[rightSlot]){
                tempArray[k] = array[leftSlot];
                leftSlot = leftSlot + 1;
                k++;
            }else if(array[rightSlot] < array[leftSlot]){
                tempArray[k] = array[rightSlot];
                rightSlot = rightSlot + 1;
                k++;
            }else if(array[rightSlot] == array[leftSlot]) {
                tempArray[k] = array[leftSlot];
                leftSlot = leftSlot + 1;
                k++;
                tempArray[k] = array[rightSlot];
                rightSlot = rightSlot + 1;
                k++;
            }
        } // Done Comparing and merging

        //Now Push remaining part of array

        if(leftSlot <= mid){                                   //Feed in left portion of array if any element is left
            while (leftSlot <= mid){
                tempArray[k] = array[leftSlot];
                leftSlot = leftSlot + 1;
                k++;
            }
        }

        if(rightSlot <= last){                                  //Feed in right portion of array if any element is left
            while (rightSlot <= last){
                tempArray[k] = array[rightSlot];
                rightSlot = rightSlot + 1;
                k++;
            }
        }

        //Put contents of temp array to their respective position in our main array

        for(int i = 0; i <= tempArray.length-1; i++){
            array[first + i] = tempArray[i];
        }
    }

}
