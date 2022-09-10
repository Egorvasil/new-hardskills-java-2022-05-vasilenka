import java.lang.reflect.Array;
import java.util.*;

public class InterestingSolution10 {

    /* Input: nums = [2,7,11,15], target = 9
       Output: [0,1]
       Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/

    public static void main(String[] args) {
        int [] array ={11,15,2,7};
        System.out.println(Arrays.toString(twoSum(array, 9)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int [] array = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]+nums[i+1]==target) {
                array[0] = i;
                array[1] = i + 1;
                return array;
            }
        }
        return nums;
    }
}