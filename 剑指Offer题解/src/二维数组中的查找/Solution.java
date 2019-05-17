package 二维数组中的查找;

public class Solution {
    public static boolean Find(int target, int [][] array)
    {
        int m = array.length;
        int n = array[0].length;
        int i = m - 1, j = 0;
        while(i >= 0 && j < n) {
            if(array[i][j] == target) {
                return true;
            } else if(array[i][j] > target) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }
}