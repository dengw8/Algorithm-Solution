package 超有爱2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        boolean sign = true;
        for(int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0) {
                sign = false;
                break;
            }
        }
        System.out.println(sign);
    }
}
