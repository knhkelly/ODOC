package odoc_240319;

import java.util.*;

public class Solution {
	public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        int fullDay = 0;
        for(int howMany : number) {
        	fullDay += howMany;
        }
        
        List<String> fullList = new ArrayList<String>();
        for(int i=0; i<want.length; i++) {
        	int count = number[i];
        	for(int j=0; j<count; j++) {
        		fullList.add(want[i]);
        	}
        }

        int startDay = discount.length - fullDay; 
        for(int i=0; i<=startDay; i++) {
        	int count = 0;
        	List<String> listCopy = new ArrayList<String>();
        	listCopy.addAll(fullList);
        	for(int j=i; j<fullDay+i; j++) {
        		int index = listCopy.indexOf(discount[j]);
        		
        		if(index == -1) break;
        		else {
        			listCopy.remove(index);
        			count++;
        		}
        		if(count == fullDay) answer++;
        	}
        }
        
        return answer;
    }
}
