import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] numbers = new int[n+1];
 
        for(int i=2; i<=n; i++) {
            numbers[i]=i;
        }
 
        for(int i=2; i<=n; i++) {
            if(numbers[i] == 0) continue;

            for(int j=2*i; j<=n; j+=i) {
                numbers[j] = 0;
            }
            
            if(numbers[i] != 0) answer++;
            //System.out.println(numbers[i]);
        }
 
    return answer;
    }
}
