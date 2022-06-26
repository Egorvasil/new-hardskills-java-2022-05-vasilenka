public class HomeworkLesson4_9 {
    public static void main(String[] args) {
            solve();
        }

        public static void solve() {
            int num = 1;
            int[][] arr = new int[3][3];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (num % 2 == 0) {
                        arr[i][j] = num;
                    }
                    System.out.print(arr[i][j] + " ");
                    num++;
                }
                System.out.println();
            }
        }

    }