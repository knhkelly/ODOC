package odoc_240130;

import java.util.*;

public class Solution2 {
	public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        List<String> dicList = new ArrayList<>(Arrays.asList(dic));
        List<String> spellList = new ArrayList<>(Arrays.asList(spell));
        for(String word : dicList) {
        	for(int i=0; i<spellList.size(); i++) {
        		if(!word.contains(spellList.get(i))) {
        			break;
        		} 
        		if(i==spellList.size()-1) {answer = 1;}
        	}
        }
        
        return answer;
    }

}
