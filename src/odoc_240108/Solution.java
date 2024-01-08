package odoc_240108;

	import java.util.*;

public class Solution {
	public String solution(String s) {
		String[] sSplit = s.split(" ");
		List<Integer> sList = new ArrayList<Integer>();
		for(int i=0; i<sSplit.length; i++) {
			int split = Integer.parseInt(sSplit[i]);
			sList.add(split);
		}
		Collections.sort(sList);
		
        String answer = sList.get(0) + " " + sList.get(sList.size()-1);
        return answer;
    }

}
