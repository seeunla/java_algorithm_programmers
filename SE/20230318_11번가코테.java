// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int solution(String S) {
        int[] count = new int[26];
        for (char c : S.toCharArray()) {
            count[c -'a']++;
        }

        int oddCount = 0;
        for (int i :count) {
            if (i%2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }
}
