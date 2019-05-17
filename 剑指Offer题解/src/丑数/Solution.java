package 丑数;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(7));
    }

    static int GetUglyNumber_Solution(int index) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int num = 1;
        int t2 = 0, t3 = 0, t5 = 0;
        for(int i = 1; i < index; i++) {
            num = Math.min(Math.min(list.get(t2) * 2, list.get(t3) * 3), list.get(t5) * 5);
            list.add(num);
            if(num == list.get(t2) * 2) t2++;
            if(num == list.get(t3) * 3) t3++;
            if(num == list.get(t5) * 5) t5++;
        }
        return list.get(index - 1);
    }
}
