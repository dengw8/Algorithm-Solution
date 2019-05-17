package 超有爱;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();

        int longer = 0;
        if(len2 > len1) longer = 1;

        int min = len2;
        if(min > len2) min = len1;

        int max = len1;
        if(max < len2) max = len2;

        int index = max;
        char []res = new char[max + 1];
        Arrays.fill(res, 'A');

        int g = 0;
        for(int turn = 0, i = len1 - 1, j = len2 - 1; turn < min; turn++) {
            int sum = (str1.charAt(i) - 'a') + (str2.charAt(j) - 'a') + g;
            g = sum / 26;
            int dig = 'a' + sum % 26;
            res[index] = (char) dig;
            index--;
        }

        if(longer == 0) {
            for(int i = len1 - len2 - 1; i >= 0; i--) {
                int sum = str1.charAt(i) - 'a' + g;
                g = sum / 26;
                int dig = 'a' + sum % 26;
                res[index] = (char) dig;
                index--;
            }
        } else {
            for(int i = len2 - len1 - 1; i >= 0; i--) {
                int sum = str2.charAt(i) - 'a' + g;
                g = sum / 26;
                int dig = 'a' + sum % 26;
                res[index] = (char) dig;
                index--;
            }
        }
        if(g == 1) {
            System.out.print('b');
            for(int i = 1; i <= max; i++) System.out.print(res[i]);
        } else {
            for(int i = 1; i <= max; i++) System.out.print(res[i]);
        }
    }
}
