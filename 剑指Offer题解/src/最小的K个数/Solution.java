package 最小的K个数;

import java.util.ArrayList;

public class Solution {

    public static void main(String []args) {
        int []array = {4,5,1,1,2,7,3,8};
        ArrayList<Integer> list = GetLeastNumbers_Solution(array, 4);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> tem = new ArrayList<>();
        int len = input.length;
        if(len < k || k < 0) return res;
        for(int i = 0; i < len; i++) {
            tem.add(input[i]);
        }
        for(int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE, index = -1;
            for(int j = 0; j < tem.size(); j++) {
                if(min > tem.get(j)) {
                    min = tem.get(j);
                    index = j;
                }
            }
            res.add(min);
            tem.remove(index);
        }
        return res;
    }
}
