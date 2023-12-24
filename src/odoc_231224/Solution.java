package odoc_231224;

public class Solution {
	public int[] solution(String[] wallpaper) {
        int top = -1;
        int bottom = -1;
        int right = -1;
        int left = -1;
        
        int count = 0;
        for(int i=0; i<wallpaper.length; i++) {
        	int semiRight = wallpaper[i].indexOf("#");
        	int semiLeft = wallpaper[i].lastIndexOf("#") +1;
        	
        	if(semiRight != -1) {
        		if(top == -1 && semiRight != -1) top = count;
        		else if(top != -1)bottom = count + 1;
        		
        		if(right == -1)	right = semiRight;
        		else if(semiRight < right) right = semiRight;
        		
        		if(left == -1) left = semiLeft;
        		else if(semiLeft > left) left = semiLeft;
        	}
        	count++;
        }
        if(bottom == -1) bottom = top+1;
        
        int[] answer = {top, right, bottom, left};
        return answer;
    }
}
