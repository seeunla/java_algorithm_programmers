class Solution {
//     public int solution(String[] board) {
//         int answer = 0;
        
//         if (board[0].equals(board[2]) 
//             && board[0].charAt(0) == board[1].charAt(1)) {
//             int o = 0, x = 0, com =0;
//             for (int i =0; i<3; i++) {
//                 // System.out.println(board[i]);
//                 for (int j =0; j<3; j++) {
//                     if(board[i].charAt(j) == 'O') o++;
//                     else if (board[i].charAt(j) == 'X') x++;
//                     else if (board[i].charAt(j) == '.') com++;
//                 }
//                 // System.out.println(com);
//             }
//             if (o == 7 || x == 7 || com == 9) answer++;
//         } else {
//             int o = 0, x = 0, com =0;
//             for (int i =0; i<3; i++) {
//                 for (int j=0; j<3; j++) {
//                     if(board[i].charAt(j) == 'O') o++;
//                     else if(board[i].charAt(j) == 'X') x++;
//                 } 
//             }
//             if (x<o && o >0) {
//                 if (!(board[0].charAt(0) == 'X'
//                     && board[0].charAt(1) == 'X'
//                     && board[0].charAt(2) == 'X')) {        
//                     answer++;
//                 }
//             }
//             if (o == x && o>0 && x>0) {
//                 if (!(board[0].charAt(0) == board[0].charAt(1)
//                       && board[0].charAt(1) == board[0].charAt(2))
//                    &&!(board[1].charAt(0) == board[1].charAt(1)
//                       && board[1].charAt(1) == board[1].charAt(2))
//                    &&!(board[2].charAt(0) == board[2].charAt(1)
//                       && board[2].charAt(1) == board[2].charAt(2))
//                    &&!(board[0].charAt(0) == board[1].charAt(0)
//                       && board[1].charAt(0) == board[2].charAt(0))
//                    &&!(board[0].charAt(1) == board[1].charAt(1)
//                       && board[1].charAt(1) == board[2].charAt(1))
//                    &&!(board[0].charAt(2) == board[1].charAt(2)
//                       && board[1].charAt(2) == board[2].charAt(2))) {
//                     answer++;
//                 }
//             }
//         }
//         return answer;
//     }
    char[][] map;
    public int win(char c) {
        int game = 0;
        for (int i=0; i<3; i++) {
            if(map[i][0] == c && map[i][0] == map[i][1] && map[i][1] == map[i][2])
                game++;
            if(map[0][i] == c && map[0][i] == map[1][i] && map[1][i] == map[2][i])
                game++;
        }
        if(map[0][0] == c && map[0][0] == map[1][1] && map[1][1] == map[2][2])
            game++;
        if(map[0][2] == c && map[0][2] == map[1][1] && map[1][1] == map[2][0])
            game++;
        return game;
    }
    public int solution(String[] board) {
        int answer =1;
        map = new char[3][3];
        int o = 0, x =0;
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                map[i][j] = board[i].charAt(j);
                if(map[i][j] == 'O') o++;
                if(map[i][j] == 'X') x++;
            }
        }
        if(x>o || o-x >1) return 0;
        if(win('O') >0 && win('X') >0) return 0;
        if(win('O') >0) {
            if (o == x) return 0;
        }
        if (win('X') > 0) {
            if(o>x) return 0;
        }
        return answer;
    } 
}
