package 网易;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int index = 0; index < t; index++) {

            int n = in.nextInt();
            int m = in.nextInt();
            int [][] array = new int[n][m];
            for(int i = 0; i < n; i++) {
                Arrays.fill(array[i], 0);
            }

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {

                    for(int t1 = i - 1; t1 <= i + 1; t1++) {
                        for(int t2 = j - 1; t2 <= j + 1; t2++) {
                            if(t1 >= 0 && t1 < n && t2 >= 0 && t2 < m) {

                                if(array[t1][t2] == 0) {
                                    array[t1][t2] = 1;
                                } else {
                                    array[t1][t2] = 0;
                                }

                            }
                        }
                    }

                }
            }

            int count = 0;
            for(int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (array[i][j] == 1) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
