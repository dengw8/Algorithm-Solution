package 百度;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0, tem;
        for(int i = 0; i < n; i++) {
            tem = in.nextInt();
            if(tem < 5900) {
                a++;
            }
        }
        float res = (float)a / (float)n;

        NumberFormat f = NumberFormat.getPercentInstance();
        f.setMinimumFractionDigits(2);
        System.out.println(f.format(res));
    }
}
