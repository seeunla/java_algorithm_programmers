import java.util.*;
class Solution {
    // public int[] solution(int[] numbers) {
    //     int[] answer = new int[numbers.length];
    //     answer[numbers.length-1] = -1;
    //     for (int i =0; i<numbers.length; i++) {
    //         for (int j=i+1; j<numbers.length; j++) {
    //             if (numbers[i] <numbers[j]) {
    //                 answer[i] = numbers[j];
    //                 break;
    //             } 
    //             else {
    //                 answer[i] = -1;
    //             }
    //         }
    //     }
    //     return answer;
    // }
    
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        
        Stack<Integer> st = new Stack<>();
        for (int i =0; i<numbers.length; i++) {
            //System.out.println(st);
            // 인덱스를 stack 에 삽입해놓고 numbers에서 뒤큰수가 나오면 인덱스를 꺼내와 답을 삽입
            while(!st.isEmpty() && numbers[i] > numbers[st.peek()]) {
                int idx = st.pop();
                answer[idx] = numbers[i];
                //System.out.println(idx);
            }
            st.push(i);
        }
        return answer;
    }
}
