package odoc_240215;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
	public int solution(int n, int[][] wires) {
        int answer = -1;
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0; i<wires.length; i++) {
        	List<Integer> wire = new ArrayList<Integer>();
        	for(int j=0; j<wires[i].length; j++) {
        		wire.add(wires[i][j]);
        	}
        	list.add(wire);
        }
        
        List<Integer> answerList = new ArrayList<Integer>();
        for(int i=0; i<wires.length; i++) {
        	List<List<Integer>> cutWires = new ArrayList<List<Integer>>();
        	cutWires.addAll(list);//깊은 복사
        	int left = list.get(i).get(0);
        	int right = list.get(i).get(1);
        	cutWires.remove(i);
        	System.out.println("=============");
        	System.out.println("cutWires" + cutWires);
        	answerList.add(solutionMethod(cutWires, left, right));
        }
        System.out.println(answerList);
        answer = Collections.min(answerList);
        return answer;
    }
	
	public int solutionMethod(List<List<Integer>> list, int left, int right){
		System.out.println("-----------");
		System.out.println("left : " + left + " right : " + right);
		List<List<Integer>> leftWire = new ArrayList<List<Integer>>();
		List<List<Integer>> rightWire = new ArrayList<List<Integer>>();
		for(int i=list.size()-1; i>=0; i--) {
			if(left == list.get(i).get(0) || left == list.get(i).get(1)) {
				leftWire.add(list.get(i));
				list.remove(i);
			}
			else if(right == list.get(i).get(0) || right == list.get(i).get(1)) {
				rightWire.add(list.get(i));
				list.remove(i);
			}
		}
		System.out.println("afterList : " + list);
		if(list.size()==0) return Math.abs(leftWire.size()-rightWire.size());
		
		int leftWireSize = leftWire.size();
		System.out.println("leftWireSize1 : " + leftWireSize);
		for(int j=0; j<leftWire.size(); j++) {
			int leftNum = leftWire.get(j).get(0);
			int rightNum = leftWire.get(j).get(1);
			leftWireSize += solutionMethod(list, leftNum, rightNum);
		}
		System.out.println("leftWireSize2 : " + leftWireSize);
		
		int rightWireSize = rightWire.size();
		System.out.println("rightWireSize1 : " + rightWireSize);
		for(int j=0; j<rightWire.size(); j++) {
			int leftNum = rightWire.get(j).get(0);
			int rightNum = rightWire.get(j).get(1);
			rightWireSize += solutionMethod(list, leftNum, rightNum);
		}
		System.out.println("rightWireSize2 : " + rightWireSize);
		
		int resultSize = Math.abs(leftWireSize-rightWireSize);
		return resultSize;
	}
}
