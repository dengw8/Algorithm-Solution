package 虎牙;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), num;

        int[] index = new int[n];
        Arrays.fill(index, 0);

        for(int i = 0; i < n; i++) {
            num = in.nextInt();
            index[num]++;
        }

        for(int i = 0; i < n; i++) {
            if(index[i] > 1) {
                System.out.println(i);
                break;
            }
        }
    }
}