package 跳台阶;

import java.util.Scanner;

public class Solution {

    public static void main(String []arg) {
        Scanner reader = new Scanner(System.in);
        int a;
        while(reader.hasNext()) {
            a = reader.nextInt();
            System.out.println(a);
        }
    }

    static int JumpFloor(int target) {
        if(target == 0) return 0;
        if(target == 1) return 1;
        int a = 1, b = 1;
        for(int i = 2; i <= target; i++) {
            int tem = a;
            a += b;
            b = tem;
        }
        return a;
    }
}