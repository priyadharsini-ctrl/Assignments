package week1.day2;

import java.util.Arrays;

public class MissingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int index=i+1;
			if(arr[i] != index) {
				System.out.println("Missing element is" +index);
				break;
			}
			
		}
	}

}
