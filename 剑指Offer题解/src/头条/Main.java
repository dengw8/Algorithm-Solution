package 头条;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        int []array = new int[256];
        Arrays.fill(array, 0);

        int count = 0, tem = 0, left = 0;

        for(int i = 0; i < len; i++) {
            if(array[str.charAt(i)] == 0 || array[str.charAt(i)] < left) {
                tem = i - left + 1;
                count = Math.max(count, tem);
            } else {
                left = array[str.charAt(i)];
            }
            array[str.charAt(i)] = i + 1;
        }
        System.out.println(count);
    }
}
