package week1.day1;


public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum=0;
		int secNum=1;
		int sum=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 1; i <12; i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}

	}

}


//initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
//Print first number
//Iterate from 1 to the 11
//Add first and second number assign to sum
//Assign second number to the first number
//Assign sum to the second number
//Print sum
