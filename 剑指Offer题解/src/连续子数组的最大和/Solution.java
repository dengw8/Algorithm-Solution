package 连续子数组的最大和;


public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int len = array.length;
        int max = array[0];
        int tem = max;
        for(int i = 1; i < len; i++) {
            tem = Math.max(tem + array[i], array[i]);
            max = Math.max(max, tem);
        }
        return max;
    }
}