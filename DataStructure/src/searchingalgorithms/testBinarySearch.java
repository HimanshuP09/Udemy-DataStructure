package searchingalgorithms;

/**
 * Created by himanshu.patwardhan on 26-Aug-17.
 */
public class testBinarySearch {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(array,9));
        System.out.println(binarySearch.binarySearch(array,1));
        System.out.println(binarySearch.binarySearch(array,7));
        System.out.println(binarySearch.binarySearch(array,0));
        System.out.println(binarySearch.binarySearch(array,10));

        System.out.println(binarySearch.recursiveBinarySearch(array,9));
        System.out.println(binarySearch.recursiveBinarySearch(array,1));
        System.out.println(binarySearch.recursiveBinarySearch(array,7));
        System.out.println(binarySearch.recursiveBinarySearch(array,0));
        System.out.println(binarySearch.recursiveBinarySearch(array,10));
    }
}
