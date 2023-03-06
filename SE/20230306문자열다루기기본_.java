class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() ==6) answer = true;
        else answer = false;
        for (char a : s.toCharArray()) {
           if (a >=65) {
               return false;
           }
        }
        
        return answer;
    }
}
