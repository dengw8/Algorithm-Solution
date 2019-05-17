package 头条;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[][] array = new int[m][m];
        int[][] index = new int[m][m];

        for(int i = 0; i < m; i++) {
            Arrays.fill(index[i], 0);
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                array[i][j] = in.nextInt();
            }
        }

        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                if(array[i][j] == 1) {
                    index[i][j] = 1;

                    boolean sign = true;

                    if(i - 1 >= 0 && index[i - 1][j] == 1) {
                        sign = false;
                    }
                    if(i + 1 < m && index[i + 1][j] == 1) {
                        sign = false;
                    }
                    if(j - 1 >= 0 && index[i][j-1] == 1) {
                        sign = false;
                    }
                    if(j + 1 < m && index[i][j + 1] == 1) {
                        sign = false;
                    }

                    if(sign) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
