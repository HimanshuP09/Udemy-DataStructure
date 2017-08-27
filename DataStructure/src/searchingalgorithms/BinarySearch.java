package searchingalgorithms;

/**
 * Created by himanshu.patwardhan on 26-Aug-17.
 */
public class BinarySearch {

    static int first;
    static int last;
    static int middle;
    static boolean flag = true;

    public int binarySearch(int[] array,int searchValue) {
      if(array.length > 0){
          first = 0;
          last = array.length-1;
          middle = findNewMiddle();
          while (first <= last){
          if(array[middle] == searchValue){
              return middle+1;
          }else {
              if (searchValue < array[middle]) {
                  last = middle - 1;
                  middle = findNewMiddle();
              } else {
                  first = middle + 1;
                  middle = findNewMiddle();
              }
           }
          }
       }
    return -1;
   }

    public int recursiveBinarySearch(int[] array,int searchValue) {
        if(array.length > 0){
            if(flag) {
                first = 0;
                last = array.length - 1;
                flag=false;
            }
            middle = findNewMiddle();
            if (first <= last){
                if(array[middle] == searchValue){
                    first = 0;
                    last = array.length - 1;
                    flag = true;
                    return middle+1;
                }else {
                    if (searchValue < array[middle]) {
                        last = middle - 1;
                        return recursiveBinarySearch(array,searchValue);
                    } else {
                        first = middle + 1;
                        return recursiveBinarySearch(array,searchValue);
                    }
                }
            }
        }
        first = 0;
        last = array.length - 1;
        flag = true;
        return -1;
    }

   public int findNewMiddle(){
        return (first + last)/2;
   }
}
