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
		
		//삼각형의 가장 겉테두리 번호를 매기는 식(이거 하드코딩인가?)
		//이걸 내부 삼각형에 적용하려면 어떻게 해야하지?
		int last = n+(n-1)+(n-2);
       	for(int i=1; i<=n+(n-1); i++) {
        	triangle.get(i-1)[0] = i;
        	if(i>1 && i<n) {
        		triangle.get(i-1)[i-1] = last;
        		last--;
        	}else if(i==n){
        		int count = 0;
        		for(i=n; i<=n+(n-1); i++) {
        			triangle.get(n-1)[count] = i;
        			count++;
        		}
        	}
        }
        
        for(int i=0; i<triangle.size(); i++) {
        	System.out.print("{");
        	for(int j=0; j<triangle.get(i).length; j++) {
        		System.out.print(triangle.get(i)[j] + " ");
        	}
        	System.out.println("}");
        }
        
        return answer;
    }
	
	public int allNum(int n) {
		if(n==1) return 1;
		return allNum(n-1)+n;
	}
}
