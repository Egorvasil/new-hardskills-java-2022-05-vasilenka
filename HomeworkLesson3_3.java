public class HomeworkLesson3_3 {
    public static void main(String[] args) {
      int num = 23114;
      int rev = 0;
      int count = 5;
      System.out.println("Original: " + num);
        for (int i = 0; i < count; i++) {
           int digit = num % 10;
           rev = rev * 10 +digit;
           num = num / 10;
        }
        System.out.println("Reversed: " + rev);
        }
    }
