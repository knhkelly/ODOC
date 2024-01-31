package odoc_240131;

import java.util.*;

public class Solution {
	public int solution(String[] babbling) {
        int answer = 0;
        
        List<String> baby = new ArrayList<String>(Arrays.asList("aya", "ye", "woo", "ma"));
        List<String> babblList = new ArrayList<String>(Arrays.asList(babbling));
        for(int j=0; j<babblList.size(); j++) {
        	for(int i=0; i<baby.size(); i++) {
        		if(babblList.get(j).contains(baby.get(i))) {
        			babblList.set(j, babblList.get(j).replaceAll(baby.get(i), "-")); 
        		}
        	}
        }
        
        for(int i=0; i<babblList.size(); i++) {
        	if(babblList.get(i).matches("[-]+")) {
        		answer++;
        	}
        }
        
        return answer;
    }

}
