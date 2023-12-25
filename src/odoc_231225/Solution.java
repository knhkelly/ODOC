package odoc_231225;

import java.util.*;

public class Solution {
	public String solution(String s, String skip, int index) {
		
		int[] sNum = new int[s.length()];
		int[] answerNum = new int[s.length()];
		for(int i=0; i<s.length(); i++) {
			sNum[i] = (int)s.charAt(i); 
			answerNum[i] = (int)s.charAt(i) + index;
//			if(answerNum[i]>122) { 
//				answerNum[i] -= 26;
//			}
		}
		
		List<Integer> skipNum = new ArrayList<Integer>();
		for(int i=0; i<skip.length(); i++) {
			int charInt = (int)skip.charAt(i);
			if(!skipNum.contains(charInt))
			skipNum.add(charInt);
		}
		
		for(int i=0; i<sNum.length; i++) {
			for(int j: skipNum) {
				System.out.println("----------------");
				System.out.println("sNum["+i+"] : " + sNum[i] + " = " +(char)sNum[i]);
				System.out.println("lastNum["+i+"] : " + answerNum[i] + " = " + (char)answerNum[i]);
				System.out.println("skipNum : " + j + " = " + (char)j);
//				if(j>=sNum[i] && j<=answerNum[i]) {
//					answerNum[i]++;
//				} else if(sNum[i]<=answerNum[i]) {
//					answerNum[i]++;
//				}
				if(answerNum[i]<=122) {
					if(j>=sNum[i] && j<=answerNum[i]) answerNum[i]++;
				} else if(answerNum[i]>122 && answerNum[i]<148) {
					
				} else {
					
				}
				System.out.println("----------------");
			}
		}
		
		String answer = "";
		for(int i=0; i<answerNum.length; i++) {
			while(answerNum[i]>122) {answerNum[i] -= 26;}
			answer = answer + (char)answerNum[i];
		}
		
        return answer;
    }
}























