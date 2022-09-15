import java.util.Arrays;

public class InterestingSolution12 {
    /*
    Given an array of integers heights representing the histogram's bar height
     where the width of each bar is 1,
    return the area of the largest rectangle in the histogram.

    Input: heights = [2,1,5,6,2,3]
    Output: 10
    Explanation: The above is a histogram where width of each bar is 1.
    The largest rectangle is shown in the red area, which has an area = 10 units.
    */
    public static void main(String[] args) {
        int [] array = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(array));
    }
    public static int largestRectangleArea(int[] array) {
        int [] copyArray = new int[array.length]; // create same array with the same elements
        for (int i = 0; i < copyArray.length; i++) {
            copyArray[i]=array[i];
        }
        Arrays.sort(copyArray); //sorted array for find largest element
        int largestElem = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==copyArray[copyArray.length-1]){
                largestElem = i; //found out the index of largest element
            }
        }
        if(array[largestElem-1]>array[largestElem+1]){ //return index of largest neighbor multiplied by 2
            int result1 = array[largestElem-1]*2;
            return result1;
        }else{
            int result2 = array[largestElem+1]*2;
            return result2;
        }
    }

}
