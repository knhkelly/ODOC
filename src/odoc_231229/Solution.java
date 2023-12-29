package odoc_231229;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int[] solution(String[] maps) {
		List<int[]> mapPoint = new ArrayList<int[]>();
		int lineCount = 0;
		int dayLength = 0;
		for(String line:maps) {
			int[] movePoint = {lineCount, 0};
			if(lineCount==0 || lineCount%2==0) {
				for(int i=0; i<line.length(); i++) {
					char food = line.charAt(i);
					if(food!='X') {
						if(dayLength==0) {
							dayLength = Character.getNumericValue(food);
							movePoint[1] = i;
						} else if(lineCount==movePoint[0]&&i==movePoint[1]+1) {
							dayLength += Character.getNumericValue(food);
						}
					}
				}
			} else {
				for(int i=line.length()-1; i==0; i--) {
					char food = line.charAt(i);
					if(food!='X') {
						
					}
				}
			}
			
		}
		
        int[] answer = {};
        return answer;
    }

}
