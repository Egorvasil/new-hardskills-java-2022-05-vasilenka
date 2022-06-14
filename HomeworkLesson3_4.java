public class HomeworkLesson3_4 {
    public static void main(String[] args) {
        int[] intArray = {1,0, 3, 2, 8, 1, 2, 3, 4};

        int max = intArray[0];
        int min = intArray[0];

        for (int j : intArray) {
            if (j >max) max = j;
        }
        System.out.println("Sum of the smallest and largest number is = " + max);}
        }

