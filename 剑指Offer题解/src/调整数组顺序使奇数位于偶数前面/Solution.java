package 调整数组顺序使奇数位于偶数前面;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public void reOrderArray(int [] array) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                list2.add(array[i]);
            } else {
                list1.add(array[i]);
            }
        }
        int n = list1.size();


        for(int i = 0; i < n; i++) {
            array[i] = list1.get(i);
        }
        for(int i = 0; i < list2.size(); i++) {
            array[i + n] = list2.get(i);
        }
    }
}