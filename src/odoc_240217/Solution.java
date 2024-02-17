package odoc_240217;

import java.util.*;

public class Solution {
	public int[] solution(String[] operations) {
		List<Integer> list = new ArrayList<Integer>();
		for(String operation:operations) {
			if(operation.charAt(0)=='I') {
				int number = Integer.parseInt(operation.substring(2, operation.length()));
				list.add(number);
				Collections.sort(list);
			} else if(list.size()!=0) {
				if(operation.equals("D 1")) list.remove(list.size()-1);
				else if(operation.equals("D -1")) list.remove(0);
			} 
		}
		
		int[] answer;
		if(list.size()==0) answer = new int[]{0, 0}; 
		else answer = new int[] {list.get(list.size()-1), list.get(0)};
		
        return answer;
    }

}
