package odoc_240205;

public class Solution {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int big = Math.max(n, m);
        int small = Math.min(n, m);
        
        for(int i=1; i<=big; i++) {
        	if(big%i==0 && small%i==0) answer[0] = i;
        }
        
        int cal = 1;
        while(answer[1]==0) {
        	int calNum = big*cal;
        	if(calNum%small==0) answer[1] = calNum;
        	cal++;
        }
        
        return answer;
    }

}
