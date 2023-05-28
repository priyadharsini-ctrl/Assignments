package week1.day2;

import java.util.Arrays;

public class DuplicateVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		

		for (int i = 0; i <nums.length; i++) {
			for (int j = i+1; j <nums.length; j++) {
				if(nums[i]==nums[j]) {
					System.out.println(nums[j]);
			
				}
			}
			
		}
		
		
		
		
//		String[] week= {"Week1","Week2"};
//		String[] day= {"Mon","Tue","Wed","Thu","Fri"};
//		
		//Week1 
		  //Mon
		  //Tue
	   //Week2
		//Mon
		
//		for (int i = 0; i < week.length; i++) {//outer loop
//			System.out.println(week[i]);
//			for(int j=0;j<day.length;j++) {//innerloop
//				System.out.println(day[j]);
//			}
//			System.out.println("***********");
//		}

		
//		way 2
//		Arrays.sort(nums);
//		for (int i = 0; i < nums.length-1; i++) {
//			if(nums[i]==nums[i+1]) {
//				System.out.println(nums[i]);
//			}
//			
//		}
	}

}
