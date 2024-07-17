package Coding;

public class prisioner_cndy {

	public static int name(int pris, int candy, int seat) {
		int sum;
		
		
			sum=(candy+seat-1)%pris;
			if (sum==0) {
				return pris;
				
			}
			else {
				return sum;
			}
		
	}
	
	public static void main(String[] args) {
		int pris=5;
		int candy=2;
		int seat=2;
		
		name(pris, candy, seat);
	}
}
