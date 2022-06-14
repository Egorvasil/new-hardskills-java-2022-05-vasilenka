public class HomeworkLesson3_1 {
    public static void main(String... args) {
        int[] array = {1, 3, 11, 2, 4, 102, 155, 177, 2990, 123, -2, -3, 18};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}