package 美团2017笔试;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        for(int i = 1; i < n; i++) {
            count *= 2;
        }
        System.out.println(count);

    }
}
