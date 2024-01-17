package odoc_240116;

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
    	
    	//초기 답안
    	List<String> runnings = Arrays.asList(players);
    	for(int i=0; i<callings.length; i++) {
    		int nowIndex = runnings.indexOf(callings[i]);
    		Collections.swap(runnings, nowIndex, nowIndex-1);
    	}
        
        String[] answer = runnings.toArray(new String[runnings.size()]);
        return answer;
    	
     
    	
    	
    }
}
