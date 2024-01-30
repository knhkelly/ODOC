package odoc_240130;

import java.util.*;

public class Solution {
	public String solution(String s) {
		String answer = "";
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<s.length(); i++) {
			int sNum = s.charAt(i);
			list.add(sNum);
		}
		Collections.sort(list, Collections.reverseOrder());

		for(int i=0; i<list.size(); i++) {
			char sChar = (char)(int)list.get(i);
			answer += sChar;
		}
        return answer;
    }

}
