package odoc_240304;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Solution {
	public int[] solution(int[] fees, String[] records) {
        List<String[]> list = new ArrayList<String[]>();
        for(String record : records) {
        	String[] oneRecord = record.split(" ");
        	list.add(oneRecord);
        }
        
        List<int[]> carList = new ArrayList<int[]>();
        while(list.size()>0) {
        	carList.add(feeCal(list));
        }
        
        Collections.sort(carList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        
        int[] answer = new int[carList.size()];
        for(int i=0; i<carList.size(); i++) {
        	answer[i] = carList.get(i)[1];
        }
        
        return answer;
    }
	
	public int[] feeCal (List<String[]> list) {
		int count = list.size();
		String carNum = list.get(0)[1];
		
		List<String[]> carData = new ArrayList<String[]>();
		for(int i=count-1; i>=0; i--) {
			if(list.get(i)[1].equals(carNum)) {
				carData.add(list.get(i));
				list.remove(i);
			}
		}
		
//        for(int i=0; i<list.size(); i++) {
//        	System.out.println(list.get(i)[0] + ", " + list.get(i)[1] + ", " + list.get(i)[2]);
//        }
//        System.out.println("========================");
//        for(int i=0; i<carData.size(); i++) {
//        	System.out.println(carData.get(i)[0] + ", " + carData.get(i)[1] + ", " + carData.get(i)[2]);
//        }

		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		int parkTime = 0; 
		for(int i=0; i<carData.size(); i+=2) {
			String in;
			String out;
			if(carData.size()%2==1 && i==carData.size()-1) {
				in = carData.get(i)[0];
				out = "23:59";
			} else {
				in = carData.get(i)[0];
				out = carData.get(i+1)[0];
			}
			try {
				//String을 date자료형으로 형변환
				Date time1 = sdf.parse(in);
				Date time2 = sdf.parse(out);
				//date자료형을 밀리세컨즈로
				long timeMil1 = time1.getTime();
				long timeMil2 = time2.getTime();
				//입차 계산(분단위) //왜 여기서 0000번만 빼고 시간이 마이너스 대로 나오지?
				long diff = (timeMil2 - timeMil1) / (1000*60);
				parkTime += diff;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("carNum" + carNum);
		System.out.println(parkTime);
		
		int fee = 0;
		if(parkTime<=180) {
			fee = 5000;
		} else {
			fee = 5000 + (parkTime-180)/10*600;
		}
		
		int carNumInt = Integer.parseInt(carNum);
		int[] carFee = {carNumInt, fee};
		System.out.println(carFee[1]);
		
		return carFee;
	}
        
        
       
}
