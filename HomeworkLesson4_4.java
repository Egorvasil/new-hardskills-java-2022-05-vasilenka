public class HomeworkLesson4_4 {
    public static void main(String[] args) {

        System.out.println(solve(5142));
    }
    public static int solve(int num){
        int min =0;
        int max=9;
        while (num>0){
            if(num%10<min){
                min = num % 10;
            }
            if(num%10>max){
                max = num%10;
            }
            num/=10;
        }
        return min + max;
    }

}