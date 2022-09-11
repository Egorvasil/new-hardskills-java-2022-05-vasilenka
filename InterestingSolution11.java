import java.util.Arrays;

public class InterestingSolution11 {
  /*
   Input: nums1 = [1,2], nums2 = [3,4]
    Output: 2.50000
    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.*/

   /* Input: nums1 = [1,3], nums2 = [2]
    Output: 2.00000
    Explanation: merged array = [1,2,3] and median is 2.
*/
    public static void main(String[] args) {
        int [] array1 = {8,16};
        int [] array2 = {4,12,10};
        System.out.println(findMedianSortedArrays(array1,array2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] newArray = new int[nums1.length+ nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            newArray[i]=nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            newArray[nums1.length+i]=nums2[i];
        }
        Arrays.sort(newArray);
        if(newArray.length%2==0){
            int firstMedian =newArray.length/2-1;
            int secondMedian = newArray.length/2;
            double result = (newArray[firstMedian]+newArray[secondMedian])/2;
            return result;
        }else if(newArray.length%2!=0){
            int index = newArray.length/2;
            int result = newArray[index];
            return result;
        }
        return -1;
    }
}