package 超有爱2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int m = in.nextInt(), item;
            count += m;

            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < m; j++) {
                item = in.nextInt();
                temp.add(item);
            }
            list.add(temp);
        }

        int[] res = new int[count];
        int index = 0;
        for(int i = 0; i < list.get(0).size(); i++) {
            res[index] = list.get(0).get(i);
            index++;
        }

        for(int i = 1; i < n; i++) {
            res = merge(res, list.get(i));
        }


        for(int i = 0; i < count; i++) {
            if(i == 0) System.out.print(res[i]);
            else System.out.print(" " + res[i]);
        }
        System.out.println();
    }

    private static int[] merge(int[]a, List<Integer> b) {
        int len = a.length + b.size();
        int []res = new int[len];

        int index = 0;
        int i = 0, j = 0;
        while(i < a.length || j < b.size()) {
            if(i >= a.length) {
                for(int t = j; t < b.size(); t++) {
                    res[index] = b.get(t);
                    index++;
                }
                return res;
            }
            if(j >= b.size()) {
                for(int t = i; t < a.length; t++) {
                    res[index] = a[t];
                    index++;
                }
                return res;
            }

            if(a[i] < b.get(j)) {
                res[index] = a[i];
                index++;
            } else {
                res[index] = b.get(j);
                index++;
            }
        }
        return res;
    }
}
