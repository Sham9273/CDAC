public class Pr6 {
	public static int gcd(int n1,int n2) {
		if(n2==0)
			return n1;
		int remain=n1%n2;
		return gcd(n2,remain);
	}
	public static void main(String[] args) {
		System.out.println(gcd(17,13));

	}

}
