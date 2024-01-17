package odoc_240116;

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
    	
    	//초기 답안
//    	List<String> runnings = Arrays.asList(players);
//    	for(int i=0; i<callings.length; i++) {
//    		int nowIndex = runnings.indexOf(callings[i]);
//    		Collections.swap(runnings, nowIndex, nowIndex-1);
//    	}
//        
//        String[] answer = runnings.toArray(new String[runnings.size()]);
//        return answer;
        
        
     // 배열 players를 map으로 변환
    	Map<Integer, String> runner = new HashMap<>(); //이름이 value인 map
    	Map<String, Integer> ranking = new HashMap<>(); //순위가 value인 map
    	for(int i=0; i<players.length; i++) {
    		runner.put(i, players[i]);
    		ranking.put(players[i], i);
    	}
    	
    	//callings에서 이름이 불린 선수의 순위 변경
    	for(int i=0; i<callings.length; i++) {
    		
    		//이름이 불린 선수의 현재 순위
    		int rank = ranking.get(callings[i]);
    		
    		// 이름이 불린 선수의 바로 앞 선수
    		String before = runner.get(rank-1); 
    		
    		//서로 순위 뒤바꾸기
    		runner.put(rank, before);
    		runner.put(rank-1, callings[i]);
    		
    		ranking.put(callings[i], rank-1);
    		ranking.put(before, rank);
    	}
    	
        String[] answer = new String[ranking.size()];
        
        for(int i=0; i<runner.size(); i++) {
        	answer[i] = runner.get(i);
        }
        
        return answer;
    	
    	
    }
}
