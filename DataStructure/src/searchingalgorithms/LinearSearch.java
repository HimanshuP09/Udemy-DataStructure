package searchingalgorithms;

/**
 * Created by himanshu.patwardhan on 26-Aug-17.
 */
public class LinearSearch {

    int j=-1;
    public int linearSearch(int[] array,int searchValue){
        for(int i = 0;i < array.length; i++){
            if(array[i]==searchValue){
               return i;
            }
        }
        return -1;
    }

    public int recursiveLinearSearch(int[] array,int searchValue){
        j++;
        int answer;
        if(j < array.length) {
            if (searchValue == array[j]) {
                answer = j;
                j = -1;
                return answer;
            } else {
                return recursiveLinearSearch(array, searchValue);
            }
        }
        j = -1;
        return -1;
    }
}
