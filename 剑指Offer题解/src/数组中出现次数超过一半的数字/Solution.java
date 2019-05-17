package 数组中出现次数超过一半的数字;

import java.util.ArrayList;

public class Solution {

    public static void main(String []args) {
        int []array = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
    public static int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        if(len == 0) return 0;
        int temp = array[0], count = 1;
        for(int i = 1; i < len; i++) {
            if(temp == array[i]) count++;
            else {
                count--;
                if(count < 0) {
                    temp = array[i];
                    count = 1;
                }
            }
        }
        count = 0;
        for(int i = 0; i < len; i++) {
            if(temp == array[i]) count++;
        }
        if(count * 2 > len) return temp;
        return 0;
    }
}