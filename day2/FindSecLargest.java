package week1.day2;

import java.util.Arrays;

public class FindSecLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int length = data.length;
		System.out.println(data[length-2] +" is second largest number");
	}

}
