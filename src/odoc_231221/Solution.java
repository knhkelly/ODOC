package odoc_231221;

import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        int n = 0;
        
        for(String str:targets) {
        	
        	int fullcount = 0;
        	for(int j=0; j<str.length(); j++) {
        		List<Integer> count = new ArrayList<>();
        		for(int i=0; i<keymap.length; i++) {
        			int click = keymap[i].indexOf(str.charAt(j));
        			if(click != -1) { count.add(click); }
	        	}
        		Collections.sort(count);
        		
        		if(count.isEmpty()) { 
        			answer[n] = -1;
        			n++;
        			j = str.length();
        		} else { 
        			fullcount = fullcount + count.get(0) + 1;
        			answer[n] = fullcount;
        			if(j==str.length()-1)n++;
        		}
        		
	        }
        }
        return answer;
    }
}