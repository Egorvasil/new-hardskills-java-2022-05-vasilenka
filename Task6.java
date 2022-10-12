import java.util.Arrays;

public class Task6 {
    /*
    * Find largest sum non-repeating elements
    * of if only one element just return it
    * */
    public static void main(String[] args) {
        int [] array1 = {-2,1,-3,4,-1,2,1,-5,4};
        int [] array2 = {5,4,-1,7,8};
        int [] array3 = {-12};
        System.out.println(Arrays.toString(largestSumInArray(array1)));
        System.out.println(Arrays.toString(largestSumInArray(array2)));
        System.out.println(Arrays.toString(largestSumInArray(array3)));
    }
    public static int [] largestSumInArray(int [] array){
        Arrays.sort(array);
        if(array.length==1){
            return new int[]{array[0]};
        }
        if(array[array.length-1]==array[array.length-2]){
            return new int[]{array[array.length-3],array[array.length-2]};
        }
        return new int[]{array[array.length-2],array[array.length-1]};
    }
}