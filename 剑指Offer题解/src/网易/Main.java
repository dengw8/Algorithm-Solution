package 网易;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();


        System.out.println(getmax(str));
    }

    static int getmax(String str) {
        int len = str.length();

        if(len == 0) return 0;
        if(len == 1) return 1;

        int count = 1;
        int tem = 1;

        char ch = str.charAt(0);
        int i = 1, j = len - 1;

        while(i < len && i <= j) {

            if(ch == 'w') {
                if(str.charAt(i) == 'b') {
                    tem++;
                    ch = str.charAt(i);
                    i++;
                } else if(str.charAt(j) == 'b') {
                    tem++;
                    ch = str.charAt(j);
                    j--;
                } else {
                    i++;
                    if(i < len) ch = str.charAt(i);
                    j = len - 1;
                    tem = 1;
                }
            }

            else if(ch == 'b') {
                if(str.charAt(i) == 'w') {
                    tem++;
                    ch = str.charAt(i);
                    i++;
                } else if(str.charAt(j) == 'w') {
                    tem++;
                    ch = str.charAt(j);
                    j--;
                } else {
                    i++;
                    if(i < len) ch = str.charAt(i);
                    j = len - 1;
                    tem = 1;
                }
            }

            count = Math.max(count, tem);
        }
        return count;
    }
}
