import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        List<Integer>[] fight = new List[n+1];
        for (int i =1; i<=n; i++) {
            fight[i] = new ArrayList<>();
        }
        for (int[] i : results) {
            fight[i[0]].add(i[1]); 
        }
        System.out.println(Arrays.toString(fight));
        
        boolean[] visited = new boolean[n+1];
        int[] rel = new int[n+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1]= true;
        while(!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.println(cur);
            for (int next: fight[cur]) {
                 if (visited[next]) continue;
                queue.add(next);
                visited[next]= true;
                rel[next] += 1;
            }
        }
        
        System.out.println(Arrays.toString(rel));
        
        return answer;
    }
}
