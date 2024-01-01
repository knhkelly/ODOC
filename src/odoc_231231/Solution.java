package odoc_231231;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
	public int solution(int[] priorities, int location) {
        int answer = 0;
        
        List<Integer> process = Arrays.stream(priorities).boxed().collect(Collectors.toList());
        int search = priorities[location];
        int maxIndex = process.lastIndexOf(Collections.max(process));
        System.out.println("maxIndex : "+maxIndex+", location : "+location);
        
        int before = Collections.frequency(process.subList(0, location), search);
        int after = Collections.frequency(process.subList(location+1, process.size()), search);
        
        if(location<maxIndex) {
        	after = Collections.frequency(process.subList(maxIndex+1, process.size()), search);
        } else if(location>maxIndex) {
        	before = Collections.frequency(process.subList(maxIndex+1, location), search);
        } else if(location==maxIndex)after = 0;
        if(Collections.max(process)==Collections.min(process)) after = 0;
        
        System.out.println("search : " + search + ", after : " + after + ", before : " + before);
        
        Collections.sort(process, Collections.reverseOrder());
        int first = process.indexOf(search) + 1;
        System.out.println("first : " + first);
        
        answer = first + before + after;
        return answer;
    }

}
