package odoc_240202;

import java.util.*;

public class Solution {
	public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		list.add(numbers[i]+numbers[j]);
        	}
        }
        
        Set<Integer> set = new HashSet<Integer>(list);
        list = new ArrayList<Integer>(set);
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }

}
