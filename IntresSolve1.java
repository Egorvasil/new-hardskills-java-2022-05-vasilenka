public class IntresSolve1 {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = ints[0];
        for (int number : ints) {
            min = Math.min(min, number);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i+5;
        }
        return array;
    }
}
