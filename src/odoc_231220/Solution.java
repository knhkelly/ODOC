package odoc_231220;

import java.util.*;

class Solution {
	int sortNum = 0;
	
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
    	int[][] answer;
    	List<int[]> answerList = new ArrayList<int[]>();
    	
    	String[] category = {"code", "date", "maximum", "remain"};
        int n = 0;
        
        int count = 0;
        
        for(int i=0; i<category.length; i++) {
        	if(category[i].equals(ext)) n=i;
        	if(category[i].equals(sort_by)) sortNum = i; 
        }
        
        for(int i=0; i<data.length; i++) {
			if(data[i][n] < val_ext) {
				answerList.add(count, data[i]);
				count++;
			}        	
		}
        answer = new int[answerList.size()][];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = answerList.get(i);
        }
        
        Arrays.sort(answer, Comparator.comparingInt((int[] o) -> o[sortNum]));  
        return answer;
    }
}