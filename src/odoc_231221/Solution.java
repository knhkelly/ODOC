package odoc_231221;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        int count = 0;
        int n = 0;
        
        
        
        for(String str:targets) {
        	System.out.println("str : " + str);
        	
        	int fullcount = 0;
        	for(int j=0; j<str.length(); j++) {
        		int countBefore = keymap[targets.length-1].length()-1;
        		for(int i=0; i<keymap.length; i++) {
	        		System.out.println("str.charAt("+j+") : " + str.charAt(j));
	        		count = keymap[i].indexOf(str.charAt(j));
	        		
	        		System.out.println("count : " + count);
	        			
	        		if(count == -1 && i == 0 && i == keymap.length-1) { countBefore = 0; continue; }
	        		else if(count == -1) { continue; }
	        		else if(count <= countBefore) {
	        			countBefore = count;
	        		}
	        		
	        	}
        		System.out.println("countBefore : " + countBefore);
        		fullcount = fullcount + countBefore + 1;
        		System.out.println("fullcount : " + fullcount);
        	}
        	if(fullcount == 1) answer[n] = -1;
    		else answer[n] = fullcount;
        	n++;
        	System.out.println("fullcount : " + fullcount);
        }
        
        
        return answer;
    }
}