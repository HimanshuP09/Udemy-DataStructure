package searchingalgorithms;

/**
 * Created by himanshu.patwardhan on 26-Aug-17.
 */
public class testLinearSearch {

     static int[] array={1,2,3,4,5,6,7,8,9,0};

    public static void main(String[] args) {
        LinearSearch ls=new LinearSearch();
        System.out.println("Try to find 9: "+ls.linearSearch(array,9));
        System.out.println("Try to find 3: "+ls.linearSearch(array,3));
        System.out.println("Try to find 10: "+ls.linearSearch(array,10));

        System.out.println("Try to find 9: "+ls.recursiveLinearSearch(array,9));
        System.out.println("Try to find 3: "+ls.recursiveLinearSearch(array,3));
        System.out.println("Try to find 10: "+ls.recursiveLinearSearch(array,10));
    }
}
