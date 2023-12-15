package odoc_231215;


class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        String[] allCards = new String[cards1.length + cards2.length];
        System.arraycopy(cards1, 0, allCards, 0, cards1.length);
        System.arraycopy(cards2, 0, allCards, cards1.length, cards2.length);
        
        int goalLength = goal.length;
        int allLength = allCards.length;
        
        if(goalLength != allLength) {
        	answer = "No";
        } else {
        	int count1OK = 0;
        	int count2OK = 0;
        	int countNO = 0;
        	for(int i=0; i<goalLength-1; i++) {
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
        	}
//        	if(count1OK + count2OK == goalLength-1) { answer = "Yes"; }
        	if(countNO == 0) { answer = "Yes"; }
        	else {answer = "No";}
        }
        
        return answer;
    }
}