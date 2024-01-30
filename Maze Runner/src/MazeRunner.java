public class MazeRunner {
    public static void main(String[] args) {

    }
    boolean isValid(int row, int col, int rows, int cols){
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
    int maze_runner(int maze[][], int rows, int cols, Cell start, Cell target){
        int directions[4][2] = {0}
    }
}
class Cell{
    int row, col, dist;
}
