package 顺时针打印矩阵;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3,4, 5, 6,7, 8, 9}};
        ArrayList<Integer> list = printMatrix(matrix);
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = matrix.length - 1;
        int m = matrix[0].length - 1;
        int layer = 0, i, count = (m + 1) * (n + 1);

        while(count > 0) {
            for(i = layer; i <= m - layer; i++) {
                list.add(matrix[layer][i]);
                count--;
            }
            for(i = layer + 1; i <= n - layer; i++) {
                list.add(matrix[i][m-layer]);
                count--;
            }
            for(i = m - 1 - layer; i >= layer  && count > 0; i--) {
                list.add(matrix[n - layer][i]);
                count--;
            }
            for(i = n - 1 - layer; i > layer  && count > 0; i--) {
                list.add(matrix[i][layer]);
                count--;
            }
            layer++;
        }
        return list;
    }
}