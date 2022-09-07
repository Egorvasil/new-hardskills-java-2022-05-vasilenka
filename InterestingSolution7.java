import java.util.*;

public class InterestingSolution7 {
    public static void main(String[] args){
        int [] array = {3,45,1,23,7,102,2};
        bubbleSort(array);
    }
    public static void bubbleSort(int [] array){
        boolean needIteration = true;
        while (needIteration){
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if(array[i]<array[i-1]){
                    int temp = array[i];
                    array[i]= array[i-1];
                    array[i-1]=temp;
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}