package 子矩阵的最大和;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = { { -90, 48, 78 }, { 64, -40, 64 }, { -81, -7, 66 } };
        System.out.println(getMaxSum(matrix));
    }

    /**
     * 我们求出以每一行的为首行的子矩阵的列累加和，就是将列对应相加,
     * 这样我们就得到了一个数组，接下来我们求这个数组的子数组最大和也就是求出了这个子矩阵的最大和。
     * @param array
     * @return
     */
    private static int getMaxSum(int[][] array) {
        if(array == null || array.length == 0 || array[0].length == 0) {
            return 0;
        }

        int m = array.length;
        int n = array[0].length;
        int max = Integer.MIN_VALUE, temp;

        for(int i = 0; i < m; i++) {
            for(int j = i + 1; j < m; j++) {
                temp = 0;
                for(int t = 0; t < n; t++) {
                    array[i][t] += array[j][t];
                    temp += array[i][t];
                    max = Math.max(max, temp);
                    temp = (temp > 0 ? temp : 0);
                }
            }
        }
        return max;
    }
}
