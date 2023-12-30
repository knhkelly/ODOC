package odoc_231230;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> comDay = new ArrayList<Integer>();
        for(int i=0; i<progresses.length; i++) {
        	int day = 1;
        	int complete = progresses[i];
        	for(day=1; complete<100; day++) {
        		complete = progresses[i]+speeds[i]*day;
        		if(complete>=100) break;
        	}
        	comDay.add(day);
        }
        
        int count = 1;
        List<Integer> outDay = new ArrayList<Integer>();
        int out = comDay.get(0).intValue();
        for(int i=1; i<comDay.size(); i++) {
        	int today = comDay.get(i).intValue();
        	if(out>=today) count++;
        	else if(out<today) {
        		outDay.add(count);
        		out = today;
        		count = 1;
        	} 
        	if(i==comDay.size()-1)outDay.add(count);
        }
        
        int[] answer = new int[outDay.size()];
        for(int i=0; i<outDay.size(); i++) {
        	answer[i] = outDay.get(i);
        }
        
        return answer;
    }

}
