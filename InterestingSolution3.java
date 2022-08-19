/*
РАМКА
 */

public class InterestingSolution3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 20 ; j++) {
                if (i == 1 || i == 10) {
                    System.out.print('Б');
                } else if (j == 1 || j == 20) {
                    System.out.print('Б');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}