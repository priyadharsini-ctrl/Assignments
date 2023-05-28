package week1.day2;

public class Maths {
	
	
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;	
	}

	public int div(int a, int b) {
		return a/b;	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maths calc = new Maths();
		System.out.println(calc.add(2, 15));
		System.out.println(calc.sub(20, 23));
		System.out.println(calc.div(25, 4));

	}

}
