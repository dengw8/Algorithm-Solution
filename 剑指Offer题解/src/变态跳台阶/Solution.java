package 变态跳台阶;

public class Solution {
    public int JumpFloorII(int target) {
        if(target <= 2)
            return target;
        return JumpFloorII(target - 1) * 2;
    }
}