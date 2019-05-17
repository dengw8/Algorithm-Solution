package 替换空格;

public class Solution {
    public String replaceSpace(StringBuffer str) {
        String strs = str.toString();
        int len = strs.length();

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < len; i++) {
            if(strs.charAt(i) != ' ') {
                builder.append(strs.charAt(i));
            } else {
                builder.append("%20");
            }
        }
        return builder.toString();
    }
}