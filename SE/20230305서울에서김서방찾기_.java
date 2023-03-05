import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        StringBuffer answer = new StringBuffer();
        answer.append("김서방은 ");
        for(int i =0; i< seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                String n = String.valueOf(i);
                answer.append(n);
            }
        }
        answer.append("에 있다");
        return answer.toString();
    }
}
