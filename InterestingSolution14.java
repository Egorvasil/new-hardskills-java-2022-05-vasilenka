import java.util.Arrays;
public class InterestingSolution14 {
//    Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
//    Output: 3
//    Explanation: The repeated subarray with maximum length is [3,2,1].

    public static void main(String[] args) {
        int [] array1 ={1,2,3,2,1};
        int [] array2 ={3,2,1,4,7};
        System.out.println(findLength(array1,array2));
    }
    public static int findLength(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        for (int i = 0; i < nums1.length-1; i++) {
            if(nums1[i]==nums1[i+1]){
                nums1[i]=0; //for make sure, elements not repeated
            }
        }
        int counter = 0;
        for (int i = 0; i < nums1.length; i++) {
           for (int j = 0; j < nums2.length ; j++) {
                if(nums1[j]==nums2[i]){
                    counter++;
                }
            }
        }
        return counter;
    }
}
