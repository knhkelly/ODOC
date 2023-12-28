package odoc_231228;

public class Solution3 {
	boolean solution(String s) {
        boolean answer = true;

        int countP = 0;
        int countY = 0;
        for(int i=0; i<s.length(); i++) {
        	char whatChar = s.charAt(i);
        	
        	if(whatChar=='p' || whatChar=='P') countP++;
        	else if(whatChar=='y' || whatChar=='Y') countY++;
        }
        if(countP ==0 && countY ==0) answer = true;
        else if(countP == countY) answer = true;
        else answer = false;

        return answer;
    }

}
