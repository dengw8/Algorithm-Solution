package 京东;

import java.util.*;


public class Main2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int Solve(int[] a) {
        int count = 0;
        int len = a.length;
        for(int i = 0; i < len; i++) {
            for(int turn = 1, j = (i + 1) % len; turn < len ; turn++, j = (++j) % len) {
                if(isGet(a, i, j, len)) count++;
            }
        }

        return count / 2;

    }

    static boolean isGet(int[] array, int i, int j, int len) {
        if(Math.abs(i - j) == 1 || Math.abs(i - j) == len - 1) return true;

        boolean sign1 = true;
        boolean sign2 = true;
        if(i < j) {
            for(int index = i + 1; index < j; index++) {
                if(array[index] > array[i] || array[index] > array[j]) {
                    sign1 = false;
                    break;
                }
            }

            for(int turn = 1, index = (j + 1) % len; turn < len - (j - i); index = (++index) % len, turn++) {
                if(array[index] > array[i] || array[index] > array[j]) {
                    sign2 = false;
                    break;
                }
            }
        } else {
            for(int index = j + 1; index <= i; index++) {
                if(array[index] > array[i] || array[index] > array[j]) {
                    sign1 = false;
                    break;
                }
            }
            for(int turn = 1, index = (i + 1) % len; turn < len - (i - j); turn++, index = (++index) % len) {
                if(array[index] > array[i] || array[index] > array[j]) {
                    sign2 = false;
                    break;
                }
            }
        }

        return sign1 | sign2;
    }

    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        res = Solve(array);
        System.out.println(res);

    }
}