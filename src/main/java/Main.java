
/**
 * Created by Snoopy on 2017/6/3.
 */
public class Main {
    public static void main(String[] args) {
        init();
    }

    public static int[][] init() {
        int array[][] = {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};

        return array;
    }

    public static int[][] handle(int array[][]) {
        int coverArr[][] = new int[array.length][array[0].length];
        int newCellState = 0;
        int state=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                state = judge(array, i, j);
                newCellState=cellState(array,state);
                coverArr[i][j]=newCellState;
            }
        }
        return null;
    }

    public static int judge(int[][] array, int i, int j) {
        int state=0;
        return state;
    }

    public static int  cellState(int[][] array, int state) {
        return 0;
    }


    public static int cellCount(int[][] array) {
        int count = 0;
        return count;
    }
}
