import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr);
        StringBuilder st = new StringBuilder();
        for(int i =arr.length-1; i>=0; i--) {
            st.append(arr[i]);
        }
        return Long.parseLong(st.toString());
    }
}
