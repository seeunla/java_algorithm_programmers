import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int depth =0;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Set<Integer> visit = new HashSet<>();
        
        q1.offer(x);
        q2.offer(0);
        visit.add(x);
        
        while (!q1.isEmpty()) {
            int qX = q1.poll();
            int d = q2.poll();
            
            //System.out.println(qX);
            if(qX == y) return d;
            int[] arr = {qX * 3, qX * 2, qX +n};
            
            for (int nextInt : arr) {
                if (!visit.contains(nextInt) && nextInt <=y) {
                    visit.add(nextInt);
                    q1.offer(nextInt);
                    q2.offer(d+1);
                    //System.out.println(q1);
                    //System.out.println(q2);
                }
            }
        }
        return -1;
    }
}
