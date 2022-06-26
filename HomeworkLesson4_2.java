public class HomeworkLesson4_2 {
    public static void main(String[] args) {
        int []arr = {4, 5, 11, 23, 55, 155, 22, 90, 1223, -15, -27, -100};
        solve(arr);
    }
    public static int solve(int []array){
        int a = 1;
        for (int num:array) {
            if(num%5==0){
                a*=num;
                System.out.println(num);
            }
        }
return a;
    }

}