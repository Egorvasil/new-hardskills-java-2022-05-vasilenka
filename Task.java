import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {

//    Input: list1 = [1,2,4], list2 = [1,3,4]
//    Output: [1,1,2,3,4,4]

    public static void main(String[] args) {
        int [] array = {1,2,4};
        int [] array2 = {1,3,4};
        System.out.println(Arrays.toString(mergeTwoLists(array,array2)));
    }
    public static int [] mergeTwoLists(int [] array1, int [] array2) {
        int [] newArray = new int[array1.length+array2.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i]=array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            newArray[array1.length+i]=array2[i];
        }
        Arrays.sort(newArray);
        return newArray;
    }
}