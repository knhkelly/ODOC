package odoc_240119;

import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
//        List<Integer> delArr = new ArrayList<Integer>();
//        for(int i=0; i<arr.length; i++) {
//        	delArr.add(arr[i]);
//        }
//        
//        int index=1;
//        while(index<delArr.size()) {
//        	if(delArr.get(index)==delArr.get(index-1)) {
//        		delArr.remove(index);
//        	}
//        	else index++;
//        }
//        
//        int[] answer = new int[delArr.size()];
//        for(int i=0; i<delArr.size(); i++) {
//        	answer[i] = delArr.get(i).intValue();
//        }
		
		
		// 배열 arr를 HashMap delArr로 변환
		Map<Integer, Integer> origArr = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			origArr.put(i, arr[i]);
		}
		
		// delArr에서 앞과 중복되는 값 삭제
		int index = 0;
		for(int i=1;i<arr.length; i++) {
			if(origArr.get(i)==origArr.get(index)) {
				origArr.remove(i);
			} else {
				index = i;
			}
		}
		
		Set<Integer> keySet = origArr.keySet();
		index=0;
		int[] answer = new int[origArr.size()];
		for(Integer key:keySet) {
			answer[index] = origArr.get(key);
			index++;
        }
		
        return answer;
    }

}
