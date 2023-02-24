import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> top = new ArrayList<>();
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int acount=0; int bcount =0; int ccount =0;
        
        for (int i =0; i<answers.length; i++) {
            if (answers[i] == a[i%5]) acount++;
            if (answers[i] == b[i%8]) bcount++;
            if (answers[i] == c[i%10]) ccount++;
        }
        //System.out.println(as +" "+ bs+" " + cs);
        if (acount >= Math.max(bcount, ccount)) top.add(1);
        if (bcount >= Math.max(acount, ccount)) top.add(2);
        if (ccount >= Math.max(bcount, acount)) top.add(3);
        
        int[] answer = new int[top.size()];
        int i = 0;
        for (int j : top) {
            answer[i] = j;
            i++;
        }
        return answer;
    }
}
