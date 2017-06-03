
/**
 * Created by Snoopy on 2017/6/3.
 */
public class Main {
    public static void main(String[] args) {
        int[][] initArray = init();
        execute(initArray);
    }

    public static void execute(int initArray[][]) {
        int[][] result = handle(initArray);
        print(result);
    }

    public static void print(int result[][]) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] init() {
        //int array[][] = {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        int array[][] = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        return array;
    }

    public static int[][] handle(int array[][]) {
        int coverArr[][] = new int[array.length][array[0].length];
        int newCellState = 0;
        int state = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                state = count(array, i, j);
                newCellState = cellState(array, state, array[i][j]);
                coverArr[i][j] = newCellState;
            }
        }
        return coverArr;
    }

    public static int count(int[][] array, int m, int n) {
        int sum = 0;
        //左上
        for (int i = m - 1; i <= m + 1; i++) {
            for (int j = n - 1; j <= n + 1; j++) {
                if (i == m && j == n)
                    continue;
                if (i == -1 || j == -1 || i == array.length || j == array[0].length)
                    continue;
                if (array[i][j] == 1) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int cellState(int[][] array, int state, int oldState) {
        if (state == 3) {
            return 1;
        } else if (state == 2)
            return oldState;
        else
            return 0;
    }


    public static int cellCount(int[][] array) {
        int count = 0;
        return count;
    }
}
