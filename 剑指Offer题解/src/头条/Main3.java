package 头条;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    private static int num = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        search(str, 4, 0, str.length());

        System.out.println(num);
    }

    static void search(String s,  int count, int index, int len) {
        if(count == 0 && index == len) {
            num++;
            return;
        }
        if((count == 0 && index < len) || (count > 0 && index == len)) {
            return;
        }
        int value = 0;
        boolean flag = true;
        while(index < len && flag) {
            if(value == 0 && s.charAt(index) == '0') {
                flag = true;
            }
            value = value * 10 + s.charAt(index) - '0';

            index++;

            if(value < 256) {
                search(s, count - 1, index, len);
            }
        }
    }
}
