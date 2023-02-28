import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        int tmp=0;
        int index =0;
        
        String str = "";
        for (int i =0; i<dartResult.length();i++) {
            char ch = dartResult.charAt(i);
            if( ch >= '0' && ch <= '9') {
                str+=String.valueOf(ch);
            }
            
            else if (ch == 'S' || ch == 'D' || ch == 'T') {
                tmp = Integer.parseInt(str);
                if (ch == 'S' ) {
                    score[index++]+= (int) Math.pow(tmp,1);
                    System.out.println(index);
                } 
                if (ch == 'D') {
                    score[index++] +=(int) Math.pow(tmp,2);
                    System.out.println(index);
                }
                if (ch == 'T') {
                    score[index++] +=(int) Math.pow(tmp,3);
                    System.out.println(index);
                }
                str ="";
            }
            else {
                if (ch == '*') {
                    score[index-1] *= 2;
                    if (index - 2 >=0) {
                        score[index-2] *=2;
                    }
                    
                } else {
                    score[index-1] *= -1;
                }    
            }
        }
        
        return score[0] + score[1] + score[2];
    }
    
}
