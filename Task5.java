import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task5 {
    //given sorted array [-1, 2, 5, 8], target = 7 -> [2,5]
    //given sorted array [-3, -1, 0, 2, 6], target = 6 -> [0,6]
    //given sorted array [2, 4, 5], target = 8 -> []
    public static void main(String[] args) {
        int [] array = {-3, -1, 0, 2, 6};
        System.out.println(Arrays.toString(firstSolution(array,6)));
        int [] array2 = {-3, 0 , 2, 4, 5};
        System.out.println(Arrays.toString(secondSolution(array2, 6)));
    }
    public static int [] firstSolution(int [] array, int target){ //first and easiest solution
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[i]+array[j]==target){
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[0];
    }
    public static int [] secondSolution(int [] array, int target){ //fast and clean solution
        Set<Integer>HashSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            HashSet.add(array[i]); //add next element from given array
            int result = target-array[i]; //required element for sum target
            if(HashSet.contains(result)){ // check required element in our HashSet
                return new int[]{result, array[i]};
            }
        }
        return new int[0];
    }
}