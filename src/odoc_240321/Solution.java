package odoc_240321;

import java.util.*;

public class Solution {
	public int[] solution(int[][] edges, int[] target) {
        int[] answer = {};
        
        //매번의 루트만 찾으면 될 줄 알았는데 전전의 루트까지 저장해두지 않으면 이번 루트를 찾을 수가 없다는 걸 발견했다.
        //이걸 어떻게 해결하지?
        List<int[]> root = new ArrayList<int[]>();
        List<int[]> thisRoot = new ArrayList<int[]>();
        for(int i=0; i<3; i++) {
        	root = thisRoot(edges, root);
        	for(int[] temp : root) {
        		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
        	}
        	System.out.println("============");
        }
        
        return answer;
    }
	
	public List<int[]> thisRoot(int[][] edges, List<int[]> oldRoot){
		System.out.println("oldRoot");
		for(int[] node : oldRoot) {
			System.out.println("[" + node[0] + ", " + node[1] + "]");
		}
		
		List<int[]> newRoot = new ArrayList<int[]>();
        List<int[]> rootNode = new ArrayList<int[]>();
        List<int[]> etcNode = new ArrayList<int[]>();
        for(int[] edge : edges){
        	if(edge[0] == 1) rootNode.add(edge);
        	else etcNode.add(edge);
        }
        
        int[] arr = {1, 2};
        if(oldRoot.isEmpty()) newRoot.add(arr);
        else{
       		for(int i=0; i<rootNode.size(); i++) {
       			int[] temp = rootNode.get(i);
        		if(oldRoot.get(0)[1] < temp[1]) {
        			newRoot.add(temp);
        		} else if(i == rootNode.size()-1) {
        			newRoot.add(arr);
        		}
        	}
        }
		
        int[] lastNode = newRoot.get(newRoot.size()-1);
        int roof = 0;;
        for(int[] node : etcNode) {
        	if(node[0]==lastNode[1]) {
        		roof++;
        	} 
        }
        
        while(roof > 0) {
        	int count = 0;
        	for(int i=0; i<etcNode.size(); i++) {
        		if(etcNode.get(i)[0] == lastNode[1]) {
        			count++;
        			int[] temp = etcNode.get(i);
        			System.out.println("temp : [" + temp[0] + ", " + temp[1] + "]");
        			if(!oldRoot.contains(temp)) {
        				newRoot.add(temp);
        				break;
        			} else if(count == roof) {
        				newRoot.add(temp);
        			}
        		}
        	}
        	lastNode = newRoot.get(newRoot.size()-1);
        	roof = 0;
        	for(int[] node : etcNode) {
            	if(node[0]==lastNode[1]) roof++;
            }
        }
		
		return newRoot;
	}

}
