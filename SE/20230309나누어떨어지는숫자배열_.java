import java.util.*;

class Solution {
  // 1
    public int[] solution(int[] arr, int divisor) {
        int size =0;
        for (int i : arr) {
            if (i % divisor == 0) size++;
        }
        if (size == 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[size];
        for (int i: arr) {
            if (i% divisor == 0) answer[size-=1] = i; 
        }
        Arrays.sort(answer);
        return answer;
    }
  
  // 2
  public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) list.add(i); 
        }

        if (list.size() == 0) {
            int[] answer = {-1};
            return answer;
        } 
        int[] answer = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}
