package 超有爱;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num == 0) {
            System.out.println(0);
            return;
        }
        boolean isna = false;
        if(num < 0) {
            num *= -1;
            System.out.print("-");
        }
        String res = "";
        while(num > 0) {
            int a = num % 10;
            res += a;
            num /= 10;
        }

        int index = 0;
        for(int i = 0; i < res.length(); i++) {
            if(res.charAt(i) != '0') {
                index = i;
                break;
            }
        }
        for(int i = index; i < res.length(); i++) {
            System.out.print(res.charAt(i));
        }
        System.out.println();
    }
}
