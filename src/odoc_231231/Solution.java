package odoc_231231;

import java.util.*;

public class Solution {
	public int solution(int[] priorities, int location) {
        int answer = 0;
        
        List<String> process = new ArrayList<String>();
        int count = 0;
        for(int i=0; i<priorities.length; i++) {
        	int importanceNum = priorities[i];
        	String processAlaphabet = String.valueOf((char)(i + 65));
        	if(count!=0 && importanceNum>priorities[i-1]) {
        		count=0;
        		process.add("cut" + importanceNum+processAlaphabet);
        	} else {
        		count++;
        		process.add(importanceNum+processAlaphabet);
        	}
        }
        System.out.println("중요도+프로세스 : "+process);
        
        String searchProcess = process.get(location);
        if(searchProcess.contains("cut")) searchProcess = searchProcess.substring(3, 5);
        System.out.println("검색 프로세스 : "+searchProcess);
        
        int start = 0;
        List<List<String>> cutProcess = new ArrayList<List<String>>();
        for(int i=0; i<process.size(); i++) {
        	if(process.get(i).contains("cut")) {
        		process.set(i, process.get(i).substring(3, 5));
	        	List<String> cutting = process.subList(start, i);
	        	cutProcess.add(cutting);
	        	start = i;
        	}
        	if(i==process.size()-1) {
        		cutProcess.add(process.subList(start,process.size()));
        	}
        }
        System.out.println("cutProcess : "+cutProcess);
        
        for(int i=0; i<cutProcess.size(); i++) {
        	if(i!=0) {
        		int beforeNum = Integer.parseInt(cutProcess.get(i-1).get(0).substring(0, 1)); 
        		int nowNum = Integer.parseInt(cutProcess.get(i).get(0).substring(0, 1)); 
        		if(beforeNum<nowNum) {
        			Collections.swap(cutProcess, i, i-1);
        		}
        	}
        }
        System.out.println("중요도 순으로 정렬 : "+cutProcess);
        
        List<String> answerList = new ArrayList<String>();
        for(int i=0; i<cutProcess.size(); i++) {
        	for(int j=0; j<cutProcess.get(i).size(); j++) {
        		answerList.add(cutProcess.get(i).get(j));
        	}
        }
        System.out.println("중요도 순으로 정렬 : "+answerList);
        
        answer = answerList.indexOf(searchProcess)+1;
        return answer;
    }

}
