package Coding;

public class reverse_number {

	public static void reverse(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println("the reverse number is:  " + rev);
	}
	
	public static void main(String[] args) {
		int num=587;
		reverse(num);
	}

}
