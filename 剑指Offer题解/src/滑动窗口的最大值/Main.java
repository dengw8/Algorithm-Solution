package 滑动窗口的最大值;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int []a = {2,3,4,2,6,2,5,1};
        ArrayList<Integer> list = maxInWindows(a, 3);
        for(int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
    }

    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int len = num.length;

        for(int i = 0, j = size - 1; j < len; i++, j++) {
            int max = num[i];
            for(int index = i + 1; index <= j; index++) {
                if(max < num[index]) max = num[index];
            }
            list.add(max);
        }

        return list;
    }
}
