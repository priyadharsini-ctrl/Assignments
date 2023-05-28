package week1.day1;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=13;
		for(int i=2; i<=n; i++) {
			if(i%n==0) {
				System.out.println(n+" is a prime number");
			}
		}
	}

}
