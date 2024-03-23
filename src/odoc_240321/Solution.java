package odoc_240321;

import java.util.*;

public class Solution {
	public int[] solution(int[][] edges, int[] target) {
        int[] answer = {};
        
        
        List<int[]> root = new ArrayList<int[]>();
        for(int i=0; i<3; i++) {
        	root = thisRoot(edges, root);
        	for(int[] temp : root) {
        		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
        	}
        }
        
        
        return answer;
    }
	
	public List<int[]> thisRoot(int[][] edges, List<int[]> root){
		
        List<int[]> rootNode = new ArrayList<int[]>();
        List<int[]> etcNode = new ArrayList<int[]>();
        for(int[] edge : edges){
        	if(edge[0] == 1) rootNode.add(edge);
        	else etcNode.add(edge);
        }
        
        int[] arr = {1, 2};
        if(root.isEmpty()) root.add(arr);
        else{
       		for(int i=0; i<rootNode.size(); i++) {
        		if(root.get(0)[1] < rootNode.get(i)[1]) {
        			root.set(0, rootNode.get(i));
        		} else if(i == rootNode.size()-1) {
        			root.set(0, arr);
        		}
        	}
        }
		
        for(int[] edge : etcNode) {
        	if(edge[0] == root.get(0)[1]) {}
        }
		
		return root;
	}

}
