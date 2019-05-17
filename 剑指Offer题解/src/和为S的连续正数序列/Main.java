package 和为S的连续正数序列;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = FindContinuousSequence(3);
        for(int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(" " + list.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int n = (int) Math.sqrt(2 * sum); n >= 2; n--) {
            if((sum % n == 0 && n % 2 == 1) || ((sum % n) * 2) == n) {
                ArrayList<Integer> list = new ArrayList<>();
                if(n % 2 == 1) {
                    for(int i = sum / n - n / 2; i <= (sum / n + n / 2); i++) {
                        list.add(i);
                    }
                } else {
                    for(int i = sum / n - (n / 2 - 1); i <= (sum / n + n / 2); i++) {
                        list.add(i);
                    }
                }
                ans.add(list);
            }
        }
        return ans;
    }
}
