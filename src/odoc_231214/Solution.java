package odoc_231214;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int time = attacks[attacks.length-1][0];
        int count = 0;
        int totalhealth = health;
        int attackTime = 0;
        
        for(int i=1; i<=time; i++){
                        
            if(i == attacks[attackTime][0]){
                totalhealth = totalhealth - attacks[attackTime][1];
                if(totalhealth <= 0) {
                    answer = -1;
                    return answer;
                }
                attackTime++;
                count = 0;
            } else {
                totalhealth = totalhealth + bandage[1];
                if(totalhealth >= health) {totalhealth = health;}
                count++;
            }
            
            if(count == bandage[0]) {
                totalhealth = totalhealth + bandage[2];
                count = 0;
            }
           
            answer = totalhealth;
        }
        if(answer <= 0) {answer = -1;}
        
        return answer;
    }
    
}