package 整数中1出现的次数;

public class Solution {

    public int NumberOf1Between1AndN_Solution(int n) {
        if(n < 1) return 0;
        int count = 0;
        for(int i = 1; i <= n; i++) {
            int tem = i;
            while(tem != 0) {
                if(tem % 10 == 1) count++;
                 tem /= 10;
            }
        }
        return count;
    }


    public int NumberOf1Between1AndN_Solution2(int n) {
        if(n < 1) return 0;
        int count = 0;
        String tem;
        for(int i = 1; i <= n; i++) {
            tem = i + "";
            count += calcCount(tem);
        }
        return count;
    }

    public int calcCount(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') count++;
        }
        return count;
    }
}