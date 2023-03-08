class Solution {
    boolean solution(String s) {

        String[] chars = s.split("");
        int tmp1= 0;
        int tmp2= 0;
        
        for (String c : chars ) {
            if (c.equals("p")) {
                tmp1++;
            }
            if (c.equals("P")) {
                tmp1++;
            }
            if(c.equals("y")) {
                tmp2++;
            }
            if(c.equals("Y")) {
                tmp2++;
            }
        }
        if (tmp1 == tmp2) return true;
        return false;

    }
}
