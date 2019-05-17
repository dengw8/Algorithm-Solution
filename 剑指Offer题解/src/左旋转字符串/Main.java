package 左旋转字符串;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(LeftRotateString(str, 3));
    }

    public static String LeftRotateString(String str, int n) {
        int len = str.length();
        if(len == 0) return "";

        if(n > len) n %= len;

        StringBuilder s = new StringBuilder();

        for(int i = n; i < len; i++) {
            s.append(str.charAt(i));
        }
        for(int i = 0; i < n; i++) {
            s.append(str.charAt(i));
        }

        return s.toString();
    }
}
