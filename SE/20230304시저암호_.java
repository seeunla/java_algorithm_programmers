import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuffer answer = new StringBuffer();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c+n >122 || (c+n > 90 && c < 91)) answer.append((char)(c - 26 + n));
            else if (c == ' ') answer.append(c);
            else answer.append((char)(c + n));
        }
        return answer.toString();
    }
}
