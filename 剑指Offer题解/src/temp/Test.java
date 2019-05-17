package temp;

public class Test {
    public static void main(String[] args) {
        String str = "abc";
        String a = new String("abc");
        str = a;
        System.out.println(str == "abc");
    }
    private static void change(Integer i) {
        i = 2;
    }
}