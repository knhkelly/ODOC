package odoc_240122;

public class Solution {
	public int solution(int n) {
		int answer = 0;

		int each = 4;
		while(each<=n) {
			int count = 0;
			for(int i=1; i<=each; i++) {
				if(each%i == 0) count++;
			}
			if(count >= 3) answer++;
			each++;
		}
        return answer;
    }
}
