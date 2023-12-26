package odoc_231225;

import java.util.*;

public class Solution {
	public String solution(String s, String skip, int index) {
		
		String answer = "";
		
        List<String> allphabet = new ArrayList<String>();
        for(int i=97; i<123; i++) {
        	char alphabet = (char)i;
        	allphabet.add(String.valueOf(alphabet));
        }
        
        List<String> skipList = new ArrayList<String>();
        for(int i=0; i<skip.length(); i++) {
        	skipList.add(String.valueOf(skip.charAt(i)));
        }
        
        System.out.println("allphabet : " + allphabet);
        System.out.println("skipList : " + skipList);
        
        for(int i=0; i<s.length(); i++){
        	String searchAlphabet = String.valueOf(s.charAt(i));
        	int num = allphabet.indexOf(searchAlphabet);
        	System.out.println("searchAlphabet : " + searchAlphabet + ", num : " + num);
//        	String num = String.valueOf(s.charAt(i));
        	
        	int count = 0;
        	for(int j=1; count<=index; j++) {
        		int countNum = num+j;
        		if(countNum>=26) {while(countNum>=26)countNum -= 26;}
        		String dd = allphabet.get(countNum);
        		System.out.println(dd);
        		if(!skipList.contains(allphabet.get(countNum))) {
        			count++;
        			System.out.println("count : " + count);
        			if(count==index)answer += allphabet.get(countNum);
        		}
        		System.out.println("answer : " + answer);
        	}
        }
        
        
        return answer;
    }
}























