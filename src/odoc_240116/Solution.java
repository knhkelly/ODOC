package odoc_240116;

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
    	List<String> runnings = Arrays.asList(players);
//    	for(int i=0; i<callings.length; i++) {
//    		int nowIndex = running.indexOf(callings[i]);
//    		Collections.swap(running, nowIndex, nowIndex-1);
//    	}
    	
    	Map<String, Integer> running = new HashMap<>();
    	for(int i=0; i<players.length; i++) {
    		running.put(players[i],i);
    	}
    	for(int i=0; i<callings.length; i++) {
    		int nowIndex = running.get(callings[i]);
    		running.put(callings[i], nowIndex-1);
    	}
    	
        String[] answer = runnings.toArray(new String[running.size()]);
        return answer;
    }
}
