package odoc_240122;

import java.util.*;

public class Solution2 {
	public int[] solution(int k, int[] score) {
		
		int[] answer = new int[score.length];
		
		List<Integer> scoreList = new ArrayList<Integer>();
		
		for(int i=0; i<k; i++) {
			if(i<score.length) {
				scoreList.add(score[i]);
				Collections.sort(scoreList, Collections.reverseOrder());
				int lastIndex = scoreList.size()-1;
				answer[i] = scoreList.get(lastIndex);
			}
		}
		
		if(k<score.length) {
			for(int i=k; i<score.length; i++) {
				int last = k-1;
				if(score[i] > scoreList.get(last)) {
					scoreList.add(last, score[i]);
					Collections.sort(scoreList, Collections.reverseOrder());
				}
				answer[i] = scoreList.get(last);
			}
		}
		
        return answer;
    }

}
