package 数字在排序数组中出现的次数;

public class Main {
    public static void main(String[] args) {

    }
    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(k == array[i]) count++;
        }
        return count;
     }
}
