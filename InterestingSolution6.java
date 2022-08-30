public class InterestingSolution6 {
    public static void main(String[] args) {
        char[][] map = new char[][]{
                new char[]{'x', 'x', 'x', 'x', 'x', '-', '-', 'x', 'x', 'x'},
                new char[]{'x', 'x', 'x', 'x', '-', '-', 'x', 'x', 'x', 'x'},
                new char[]{'x', 'x', 'x', '-', '-', 'x', 'x', 'x', 'x', 'x'},
                new char[]{'x', '-', '-', '-', 'x', 'x', 'x', 'x', 'x', 'x'},
                new char[]{'-', '-', '-', '-', 'x', 'x', 'x', 'x', 'x', 'x'},
                new char[]{'-', '-', '-', '-', '-', 'x', 'x', 'x', '-', 'x'},
                new char[]{'-', '-', 'x', '-', '-', '-', 'x', 'x', 'x', 'x'},
                new char[]{'-', '-', '-', '-', '-', '-', 'x', 'x', 'x', 'x'},
                new char[]{'x', 'x', '-', '-', '-', '-', 'x', 'x', 'x', 'x'},
                new char[]{'x', 'x', '-', '-', '-', 'x', 'x', 'x', 'x', 'x'}
        };

        System.out.println(solve(map));
    }

    public static int solve(char[][] matrix) { // общее решение (найти количество островов)
        int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 'x') { // нашли остров
                    res++;
                    helper(matrix, i, j); // если остров занимает больше одной ячейки (вычисление периметра)
                }
            }
        }
        return res;
    }

    private static void helper(char[][] matrix, int x, int y) { // метод-помощник, который вычисляет периметр острова
        int xLength = matrix.length;
        int yLength = matrix[0].length;

        if (x < 0 || y < 0 || x >= xLength || y >= yLength || matrix[x][y] == '-') { // проверяем условия выхода за границу карты (+ если ячейка является водой)
            return;
        }

        matrix[x][y] = '-';//после подчсета острова "заводнили его"

        helper(matrix, x - 1, y);
        helper(matrix, x + 1, y);
        helper(matrix, x, y - 1);
        helper(matrix, x, y + 1);

    }

}