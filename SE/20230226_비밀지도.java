class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i=0; i<n; i++) {
            String a = String.format("%0"+n+"d",Long.parseLong(Long.toBinaryString(arr1[i])));
            String b = String.format("%0"+n+"d", Long.parseLong(Long.toBinaryString(arr2[i])));
            String tmp = "";
            for (int j=0; j<n; j++) {
                String ch = Character.toString(a.charAt(j));
                String ch2 = Character.toString(b.charAt(j));
                if (ch.equals("0") && ch2.equals("0") ) {
                    tmp += " ";
                } else {
                    tmp += "#";
                }
            }
            answer[i] = tmp;
        }
        return answer;
    }
}
