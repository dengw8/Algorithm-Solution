package 美团2017笔试;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int len1 = str1.length();
        int len2 = str2.length();
        int max = 0, count = 0, i1, j1;
        for(int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    count = 0;
                    i1 = i;
                    j1 = j;
                    while(i1 < len1 && j1 < len2 && str1.charAt(i1) == str2.charAt(j1)) {
                        i1++;
                        j1++;
                        count++;
                    }
                    max= Math.max(max, count);
                }
            }
        }
        System.out.println(max);
    }
}
