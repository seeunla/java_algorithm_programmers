import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {0};
        if (arr.length > 1) {
            answer = new int[arr.length-1];
            int min = arr[0];
            for (int i =1; i<arr.length; i++) {
                if (min > arr[i]) min = arr[i];
            }
            int index =0;
            for (int i=0; i<arr.length; i++) {
                if (arr[i] == min) {
                    index--;
                } else {
                    answer[index] = arr[i];
                }
                index++;
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}
