package 美团2017笔试;

import java.util.Scanner;

public class Main3 {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            System.out.println(array[i]);
        }
        System.out.println(getMaxSize(array, 0, n - 1));
    }

    public static int getMaxSize(int[] array, int l, int r) {
        if(l == r) return array[l];

        int min = Integer.MAX_VALUE, index = 0;
        for(int i = l; i <= r; i++) {
            if(min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        int size1 = (r - l) * min, size2 = 0, size3 = 0;
        if(index == l) {
            return Math.max(size1, getMaxSize(array, l + 1, r));
        } else if(index == r) {
            return Math.max(size1, getMaxSize(array, l, r - 1));
        } else {
            return Math.max(Math.max(getMaxSize(array, l, index - 1), getMaxSize(array, index + 1, r)), size1);
        }
    }
}
