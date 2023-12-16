package odoc_231215;


class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int goalLength = goal.length;
        
        	int count1OK = 0;
        	int count2OK = 0;
        	int countNO = 0;
        	for(int i=0; i<goalLength; i++) {
        		if(count1OK < cards1.length && count2OK < cards2.length) {
        			if(goal[i].equals(cards1[count1OK])) {count1OK++;}
        			else if(goal[i].equals(cards2[count2OK])) {count2OK++;}
        			else {countNO++;}
        		} else if(count1OK >= cards1.length && count2OK < cards2.length){
        			if(goal[i].equals(cards2[count2OK])) {count2OK++;}
        			else {countNO++;}
        		} else if(count1OK < cards1.length && count2OK >= cards2.length) {
        			if(goal[i].equals(cards1[count1OK])) {count1OK++;}
        			else {countNO++;}
        		}
        	if(countNO == 0 && count1OK + count2OK == goalLength) { answer = "Yes"; }
        	else {answer = "No";}
        }
        
        return answer;
    }
}