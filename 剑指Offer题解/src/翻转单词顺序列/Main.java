package 翻转单词顺序列;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.print('a');
        System.out.print(ReverseSentence(str));
        System.out.print('a');
    }

    public static String ReverseSentence(String str) {
        int len = str.length();
        if(len == 0) return "";

        String[] strs = str.split(" ");
        if(strs.length == 0) return str;

        StringBuilder builder = new StringBuilder();

        for(int i = strs.length - 1; i >= 0; i--) {
            if(i == strs.length - 1) {
                builder.append(strs[i]);
            } else {
                builder.append(" ");
                builder.append(strs[i]);
            }
        }

        return builder.toString();
    }
}
