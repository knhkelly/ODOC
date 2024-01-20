package odoc_240119;

import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
//        
		Stack<Integer> stack = new Stack<Integer>();
		int arrLength = arr.length;
		for(int i=0; i<arrLength; i++) {
			if(i==0) stack.push(arr[i]);
			else if(stack.peek()==arr[i]) {continue;}
			else stack.push(arr[i]);
		}
		
		int index = stack.size()-1;
		int[] answer = new int[index+1];
		while(index >= 0) {
			answer[index] = stack.pop();
			index--;
		}
		
        return answer;
    }

}
