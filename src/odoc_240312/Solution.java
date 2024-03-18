package odoc_240312;

import java.util.*;

public class Solution {
	public int[] solution(int n) {
		if(n==1) {
			int[] answer = {1};
			return answer;
		}
		int allNum = allNum(n);
		int[] answer = new int[allNum];
        
		List<int[]> triangle = new ArrayList<int[]>();
		for(int i=1; i<=n; i++) {
			int[] line = new int[i];
			triangle.add(line);
		}
		
		int count = 1;
		int start = 0;
		int end = n-1;
		while(count <= allNum) {
			count = pyramid(start, end, count, triangle);
			start += 2;
			end--;
//			for(int i=0; i<triangle.size(); i++) {
//	        	System.out.print("{");
//	        	for(int j=0; j<triangle.get(i).length; j++) {
//	        		System.out.print(triangle.get(i)[j] + " ");
//	        	}
//	        	System.out.println("}");
//	        }
		}
		
		count = 0;
		for(int i=0; i<triangle.size(); i++) {
			for(int j=0; j<triangle.get(i).length; j++) {
				answer[count] = triangle.get(i)[j];
				count++;
			}
		}
        
        return answer;
    }
	
	public int allNum(int n) {
		if(n==1) return 1;
		return allNum(n-1)+n;
	}
	
	public int pyramid(int start, int end, int count, List<int[]> triangle){
		int point = triangle.get(start).length/2;
		for(int i=start; i<=end; i++) {
			triangle.get(i)[point] = count;
			count++;
		}
		
		if(end==triangle.size()-1) {
			int last = triangle.get(end).length-1;
			for(int i=point+1; i<=last; i++) {
				triangle.get(end)[i] = count;
				count++;
				if(i==last) point = i;
			}
		} else {
			while(triangle.get(end)[point+1]==0) {
				triangle.get(end)[point+1] = count;
				count++;
				point++;
			}
		}
		
		int line = end-1;
		while(line>start) {
			triangle.get(line)[point-1] = count;
			count++;
			line--;
			point--;
		}
		
		return count;
	}
}
