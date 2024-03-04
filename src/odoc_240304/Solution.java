package odoc_240304;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
	public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        
        List<String[]> list = new ArrayList<String[]>();
        for(String record : records) {
        	String[] oneRecord = record.split(" ");
        	list.add(oneRecord);
        }
        
        //뒤에서부터 차례대로 차번호가 같은 기록을 모아서(리스트에 넣는다?) 주차시간 계산 -> 계산이 끝난 기록은 리스트에서 삭제
        //리스트 개수가 홀수(마지막 out기록이 없음)일 때와 짝수일 때를 비교해서 계산
        //리스트가 빌 때까지 반복
        int count = list.size();
        String carTime = list.get(0)[0];
    	String carNum = list.get(0)[1];
    	String inout = list.get(0)[2];
    	List<String[]> carData = new ArrayList<String[]>();
        for(int i=count-1; i>=0; i--) {
        	if(list.get(i)[1].equals(carNum)) {
        		carData.add(list.get(i));
        		list.remove(i);
        	}
//        	if(i==count-1 && inout.equals("IN")) {
//        		String lastTime = "23:59";
//        		//String을 date자료형으로 형변환
//        		Date time1 = sdf.parse(carTime);
//        		Date time2 = sdf.parse(lastTime);
//        		//date자료형을 밀리세컨즈로
//        		long timeMil1 = time1.getTime();
//        		long timeMil2 = time2.getTime();
//        		//마지막 입차 계산(분단위)
//        		long diff = (timeMil1 - timeMil2) / (1000*60);
//        		timeFee += diff;
//        	}
        	
        }
        
//        try{
//	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
//    	}catch (ParseException e){
//			e.printStackTrace();
//		}
        
        return answer;
    }
}
