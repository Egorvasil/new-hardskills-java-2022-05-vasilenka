public class HomeworkLesson4_6 {
    public static void main(String[] args) {
        solve();
    }
    public static void solve() {
        String start = "*";
        for (int i = 0; i < 10; i++) {
            System.out.println(start);
            start += "\t*";
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(getString(i));
        }
    }

    private static String getString(int size) {
        String start = "*";
        for (int i = 0; i < size - 1; i++) {
            start += "\t*";
        }
        return start;

    }
}