package 旋转数组的最小数字;

import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if(len == 0) return 0;
        for(int i = 0; i < len; i++) {
            if(array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return array[0];
    }
}