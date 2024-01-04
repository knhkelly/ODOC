package odoc_240104;

public class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
        int index = 0;
        for(String[] onePhoto : photo) {
        	int count = 0;
        	for(int i=0; i<onePhoto.length; i++) {
        		for(int j=0; j<name.length; j++) {
        			if(onePhoto[i].equals(name[j])) {
        				count += yearning[j];
        			}
        		}
        	}
            
            answer[index] = count;
            index++;
        }
        
        return answer;
    }

}
