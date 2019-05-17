package 矩形覆盖;

public class Solution {
    public int RectCover(int target) {
        if(target <= 2) return target;
        return RectCover(target-1) + RectCover(target-2);
    }
}