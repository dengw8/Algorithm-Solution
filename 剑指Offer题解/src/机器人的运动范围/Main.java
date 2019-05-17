package 机器人的运动范围;

public class Main {

    public static void main(String[] args) {
        System.out.println(movingCount(10, 1, 100));
    }

    public static int movingCount(int threshold, int rows, int cols)
    {
        int[][] flags = new int[rows][cols];
        return moving(threshold, flags, 0, 0, rows, cols);
    }

    private static int moving(int t,int[][] flags, int i, int j, int rows, int cols)
    {
        if(i < 0 || i >= rows || j < 0 || j >= cols || getSum(i, j) > t || flags[i][j] == 1) return 0;

        flags[i][j] = 1;
        return 1 + moving(t, flags, i + 1, j, rows, cols) + moving(t, flags, i, j + 1, rows, cols);
    }


    private static int getSum(int i, int j) {
        int sum = 0;
        while(i != 0 || j != 0) {
            if(i != 0) {
                sum += i % 10;
                i /= 10;
            }

            if(j != 0) {
                sum += j % 10;
                j /= 10;
            }
        }
        return sum;
    }
}
