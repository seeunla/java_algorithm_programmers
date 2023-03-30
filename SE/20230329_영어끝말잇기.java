import java.util.*;

class Solution {
        public int[] solution(int n, String[] words) {
                int[] answer = {0,0};
                int stop = 0;

                List<String> l = new ArrayList<>();

                for (int i =0; i<words.length; i++) {
                    if (l.size() == 0) {
                        l.add(words[i]);
                        continue;
                    }
                    if (l.contains(words[i])) {
                        stop = i;
                        break;
                    }
                    if (words[i].length() < 2 || words[i].length() >50 
                       || words[i].length() == 1) {
                        stop = i;
                        break;
                    }
                    if (words[i].length() == 1) {
                        stop = i;
                        break;
                    }
                    char start = words[i].charAt(0);
                    char end = l.get(i-1).charAt(l.get(i-1).length() -1);

                    // System.out.println(start + " " + end);

                    if (start != end) {
                        stop = i;
                        break;
                    }
                    l.add(words[i]);
                }

                // System.out.println(stop);
                if (stop > 0) {
                    answer[0] = stop % n +1;
                    answer[1] = stop/n + 1;
                    return answer;
                } 

                // System.out.println(l);

                return answer;
         }
}
