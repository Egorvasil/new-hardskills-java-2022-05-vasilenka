public class HomeworkLesson4_3 {
    public static void main(String[] args) {
        int num = 23114;
        solve(num);
    }
    public static void solve(int a){
        while(a>0){
            System.out.print(a%10);
            a/=10;
        }
    }
}