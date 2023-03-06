import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
import java.util.Stack;

class Solution {
//     public int solution(int[] topping) {
//         int answer = 0;
//         int[] left = new int[topping.length];
//         int[] right = new int[topping.length];
//         Set<Integer> set = new HashSet<>();

//         for (int i=0; i < topping.length; i++) {
//             set.add(topping[i]);
//             left[i] = set.size();
//         }
//         set.clear();
//         // [1,2,2,3,3,4,4,4]
//         // [4,4,4,4,3,3,2,1]
        
//         for (int j = topping.length-1 ; j>=0; j--) {
//             set.add(topping[j]);
//             right[j] = set.size();
//         }
//         for (int i =0; i<topping.length-1; i++) {
//             //System.out.println(left[i] + " " + right[i+1]);
            
//             if (left[i] == right[i+1]) {
//                 answer++;
//             }
//         }
//         return answer;
//     }
    public int solution(int[] topping) {
        int[] left = new int[10001];
        int[] right = new int[10001];
        int r = 0; // 토핑 종류 카운팅을 위한 변수
        // 토핑 종류 초기화
        for (int x : topping) {
            if (right[x] == 0) {
                r++;
            }
            right[x]++; // 각 토핑 카운팅
            //System.out.println(right[x]);
        }
        int ans = 0;
        int l = 0;
        for (int x : topping) {
            // System.out.println("시작: "+right[x] + " " + left[x]);
            // System.out.println("r&l : " +r + " " + l);
            if (right[x] == 1) {
                r--;
            }

            if (left[x] == 0) {
                l++;
            }
            right[x]--;
            left[x]++;

            if (l == r) {
                ans++;
            }
            // System.out.println("끝: "+right[x] + " " + left[x]);
            
            // System.out.println("ans: "+ans);
        }
        return ans;
    }
}
