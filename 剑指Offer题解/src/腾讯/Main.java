package 腾讯;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; i++) {
            String num = in.next();
            BigInteger bigInstance = new BigInteger(num);
            if(isRight(bigInstance)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean isRight(BigInteger num) {
        int sum = 0;
        String str = num.toString();
        for(int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        if(num.divideAndRemainder(new BigInteger("" + sum))[1].intValue() == 0) return true;

        return false;
    }
}
/*

// 第一题 最小公倍数
public class Main {  public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);  int n = scanner.nextInt();  getPrime(n);  long ans = 2;  for (int i = 0; i < cnt; i++) {  int p = prime[i];  long a = 1;  while (a * p <= n) {
                a *= p;
            }  long b = (n / a + 1) * a;
            ans = Math.max(b, ans);
        }
        System.out.println(ans);
    }  static int cnt = 0, N = 1000006;  static boolean[] tag = new boolean[N];  static int[] prime = new int[N];  private static void getPrime(int maxnum) {  tag[0] = tag[1] = true;  int i, j;  for (i = 2; i <= maxnum; i++) {  if (tag[i] == false) {  prime[cnt++]=i;  for (j = i + i; j <= maxnum; j += i)
                { tag[j] = true;
                }
            }
        }
    }
}

// 第二题 重要城市
public class Main2 {  public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] ss = str.split(" ");  int n = Integer.parseInt(ss[0]), m = Integer.parseInt(ss[1]);  boolean[][] nodes = new boolean[n+1][n+1];  for (int i = 0; i < m; i++) {
            String[] tt = br.readLine().split(" "); int a = Integer.parseInt(tt[0]); int b = Integer.parseInt(tt[1]);
            nodes[a][b] = true;
        }  int[] nums = new int[n+1];  for (int i = 1; i <= n; i++) { boolean[] vis = new boolean[n+1]; dfs(nodes, i, i, nums, vis);
        }  int cnt = 0;  for (int i = 0; i < nums.length; i++) {  if (nums[i] > 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    } private static void dfs(boolean[][] nodes, int idx,int tar, int[] nums, boolean[] vis) { for (int i = 1; i < nodes.length; i++) { if (i != idx && nodes[idx][i] && !vis[i]) {
                nums[tar]--;
                nums[i]++;
                vis[i] = true; dfs(nodes, i, tar, nums, vis);
            }
        }
    }
}

// 第三题 Yes No

public class Main3 { public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); int n = Integer.parseInt(str); for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] ss = line.split(" "); int a = Integer.parseInt(ss[0]); int b = Integer.parseInt(ss[1]); int c = Integer.parseInt(ss[2]); int mod = a % b;
            Set<Integer> set = new HashSet<>();
            set.add(mod); while (mod != c) {
                mod = (mod + a) % b; if (set.contains(mod)) break;
            }
            System.out.println(mod == c ? "YES" : "NO");
        }
    }
}
 */