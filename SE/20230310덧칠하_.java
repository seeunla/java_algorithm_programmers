class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] visited = new boolean[section[section.length-1] +1];
        for (int i=0; i<section.length; i++) visited[section[i]] = true;
        
        for (int i =0; i< visited.length; i++) {
            if (visited[i]) {
                if (i+m >= visited.length) {
                    i = visited.length;
                } else{
                    i += m -1;
                }
                answer++;
            }
        }
        
        return answer;
    }
}
