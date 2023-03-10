import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        char[] words = s.toCharArray();
        
        for (int i =0; i < words.length; i++) {
            for (int j =0; j<index; j++) {
                do {
                    words[i]++;
                    if (words[i] >122) words[i] -= 26;
                }
                while (skip.contains(String.valueOf(words[i])));
                }
        }
            
        for (char c : words) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}
