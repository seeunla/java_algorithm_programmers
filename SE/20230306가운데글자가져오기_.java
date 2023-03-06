class Solution {
    public String solution(String s) {
        StringBuilder st = new StringBuilder();
        int mid = s.length()/2;
        
        if (s.length() % 2 !=0 ) {
            st.append(s.charAt(mid));    
        } else {
            st.append(s.charAt(mid-1));
            st.append(s.charAt(mid));
        }
        
            
        
        return st.toString();
    }
}
