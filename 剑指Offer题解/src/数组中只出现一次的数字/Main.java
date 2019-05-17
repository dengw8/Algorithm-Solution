package 数组中只出现一次的数字;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        FindNumsAppearOnce(array, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }

    public static void FindNumsAppearOnce(int []array, int num1[], int num2[]) {
        int len = array.length;
        List<Integer> list = new ArrayList<>();
        boolean temp;
        for(int i = 0; i < len; i++) {
            if(list.contains(array[i])) {
                list.remove(new Integer(array[i]));
            } else {
                list.add(array[i]);
            }
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }
}