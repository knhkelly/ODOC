package odoc_231213;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        int count = 0;
        int[] dh = {-1, 0, 1, 0};
        int[] dw = {0, 1, 0, -1};
        int checkH = 0;
        int checkW = 0;
            for(int i=0; i<4; i++){
                try{
                    checkH = h + dh[i];
                    checkW = w + dw[i];
                    if(board[h][w].equals(board[checkH][checkW])){count++;}
                } catch(Exception e){continue;}
                
            }
        answer = count;
      
        return answer;
    }
}
