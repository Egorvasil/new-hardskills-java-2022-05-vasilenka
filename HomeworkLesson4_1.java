public class HomeworkLesson4_1 {
    public static void main(String[] args) {
        int []arr={1, 3, 11, 2, 4, 102, 155, 171, 2990, 123, -2, -3, 18};
        oddArray(arr);
    }
    public static void oddArray(int[]arr){
        for (int num:arr) {
            if( num%2!=0){
            System.out.println(num);
        }
    }
}
}