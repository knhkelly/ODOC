package odoc_231229;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int[] solution(String[] maps) {
		List<int[]> mapPoint = new ArrayList<int[]>();
		int lineCount = 0;
		int dayLength = 0;
//		for(int line=0; line<maps.length; line++) {
//				for(int movePoint=0; movePoint<maps[line].length(); movePoint++) {
//					char food = maps[line].charAt(movePoint);
//					if(food!='X') {
//						if(dayLength==0) dayLength = Character.getNumericValue(food);
//					}
//				}
//			
//			
//		}
		
		for(String line:maps) {
			for(int movePoint=0; movePoint<line.length(); movePoint++) {
				char food = line.charAt(movePoint);
				if(food!='X') {
					if(dayLength==0) dayLength = Character.getNumericValue(food);
					else if(line.charAt(movePoint)-1!='X') {dayLength+=Character.getNumericValue(food);}
				}
			}
		
		
		}
		
        int[] answer = {};
        return answer;
    }

}
