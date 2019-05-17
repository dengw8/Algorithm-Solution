package 和为S的两个数字;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int []array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> list = FindNumbersWithSum(array, 9);
        for(int i = 0; i < list.size() ;i++) {
            System.out.println(" " + list.get(i));
        }
    }

    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0; int j = array.length - 1;

        while(i < j) {
            if(array[i] + array[j] == sum) {
                res.add(array[i]);
                res.add(array[j]);
                break;
            } else if(array[i] + array[j] < sum) {
                i++;
            } else {
                j--;
            }
        }

        return res;
    }
}
