package 斐波那契数列;

public class Solution {
    public int Fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int a = 1; int b = 0;
        for(int i = 2; i <= n; i++) {
            int tem = a;
            a += b;
            b = tem;
        }
        return a;
    }
}
