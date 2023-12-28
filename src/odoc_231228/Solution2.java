package odoc_231228;

public class Solution2 {
	public boolean solution(int x) {
        boolean answer = true;
        String stringX = x+"";
        
        int n = 0;
        for(int i=0; i<stringX.length(); i++) {
        	char eachX = stringX.charAt(i);
        	n += Character.getNumericValue(eachX);
        }
        if(x%n==0) answer = true;
        else answer = false;
        
        return answer;
    }

}
