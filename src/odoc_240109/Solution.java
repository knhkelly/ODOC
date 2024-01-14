package odoc_240109;

import java.util.*;

public class Solution {
	public int solution(int[] elements) {
		
		List<Integer> sumList = new ArrayList<Integer>();
		List<Integer> slice = new ArrayList<Integer>();
		int index = 0;
		for(int i=0; i<elements.length; i++) {
			for(int j=0; j<elements.length; j++) {
				if(j + index >= elements.length) slice.add(elements[j+index-elements.length]);
				else slice.add(elements[j+index]);
				int sum = 0;
				for(int sliceSum:slice) {
					sum += sliceSum;
				}
				sumList.add(sum);
				if(slice.size()==elements.length) slice.clear();
			}
	        
			index += 1;
			
		}
			            
		sumList = new ArrayList<Integer>(new HashSet<Integer>(sumList));
		int answer = sumList.size();
		return answer;
    }

}
