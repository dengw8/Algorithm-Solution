package 虎牙;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[][]array = new int[n][m];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                array[j][i] = in.nextInt();
            }
        }
        List<Integer> list = printMatrix(array);
        for(int i = 0; i < list.size(); i++) {
            if(i == 0) System.out.print(list.get(i));
            else System.out.print(" " + list.get(i));
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