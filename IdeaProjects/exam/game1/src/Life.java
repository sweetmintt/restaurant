public class Life {
    private static int m;
    private static int n;
    private static int[][] grid;
    private boolean isAlive;

    public Life(int m, int n) {
        this.m = m;
        this.n = n;
        this.grid = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = 0;
    }
    public static int[][] getGrid() {return grid;}
    public void setGrid(int[][] grid) { this.grid = grid;}
    public static void statussell() {
        int[][] newGrid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (kolvososedeq(i, j) == 3 || kolvososedeq(i, j) == 2) {
                    newGrid[i][j] = 1; // клетка жива
                } else {
                    newGrid[i][j] = 0; // клетка мертва
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = newGrid[i][j];
            }
        }
    }

    private static int kolvososedeq(int n, int m) {
        int count = 0;
        for (int i = m - 1; i < m + 1; i++)
            for (int j = n - 1; j < n + 1; j++)
                if(((i>=0)&&(i<m))&&((j>=0)&&(j<n))){
                    if((i!=n)||(j!=m))
                        count += grid[i][j];
                }
        return count;
    }
}