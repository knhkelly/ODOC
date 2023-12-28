package odoc_231228;

public class Solution4 {
	public long solution(int a, int b) {
        long answer = 0;
        
        int right = 0;
        int left = 0;

        if(a==b) return a;
        else if(a<b) {right = a; left = b;}
        else {right = b; left = a;}
        
        for(int i=right; i<=left; i++) {
        	answer += i;
        }
        return answer;
    }

}
