import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i =0; i<commands.length; i++) {
            int a = commands[i][1];
            int b = commands[i][0];
            int[] c = new int[a - b + 1];
            //System.out.println(a + " " + b);
            for (int j =0; j<c.length; j++) {
                c[j] = array[b-1+j];
                //System.out.println(c[j]);
            }
            Arrays.sort(c);
            answer[i] = c[commands[i][2]-1];
        }
        
        return answer;
    }
}
