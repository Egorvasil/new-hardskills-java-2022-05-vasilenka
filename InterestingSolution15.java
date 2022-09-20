import java.util.Arrays;

public class InterestingSolution15 {
//    Given an unsorted integer array nums, return the smallest missing positive integer.
//    You must implement an algorithm that runs in O(n) time and uses constant extra space.
//
//    Example 1:
//    Input: nums = [1,2,0]
//    Output: 3
//    Explanation: The numbers in the range [1,2] are all in the array.
//    Example 2:
//    Input: nums = [3,4,-1,1]
//    Output: 2
//    Explanation: 1 is in the array but 2 is missing.
//    Example 3:
//    Input: nums = [7,8,9,11,12]
//    Output: 1
//    Explanation: The smallest positive integer 1 is missing.

    public static void main(String[] args) {
        int [] array = {1,2,0,3};
        System.out.println(firstMissingPositive(array));
    }
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]+1==nums[i+1]){ //if natural order, just return next number
                counter++;
            }
        }
        if(counter==nums.length){
            return counter; //because if(0,1,2,3) return 4
        }
        for (int i = 0; i < nums.length; i++) { //algorithm for return first missing num
            for (int j = 1; j < nums.length; j++) {
                if(nums[i]!=j&&nums[i]>0){
                    return j;
                }
            }
        }
        return -1; //if something not working
    }
}