import java.util.*;
class Solution {
    public boolean solution(int x) {
        int n =0;
        int t = x;
        while(t>0) {
            n+= t % 10;
            t /= 10;
        }

        if (x % n ==0) return true;
        return false;
    }
}
