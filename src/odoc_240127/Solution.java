package odoc_240127;

import java.util.*;

public class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for(int i=0; i<n; i++) {
			String leng = "%0"+n+"d";
			String biString1 = Integer.toBinaryString(arr1[i]);
			String biString2 = Integer.toBinaryString(arr2[i]);
			long biInt1 = Long.parseLong(biString1);
			long biInt2 = Long.parseLong(biString2);
			list1.add(String.format(leng, biInt1));
			list2.add(String.format(leng, biInt2));
		}
		
		for(int i=0; i<n; i++) {
			String map = "";
			for(int j=0; j<n; j++) {
				if(list1.get(i).charAt(j) == '0' && list2.get(i).charAt(j) == '0') {
					map += " ";
				} else map += "#";
			}
			answer[i] = map;
		}
		
        return answer;
    }
}
