import java.util.Scanner;
public class pr4{
	
	public static void main(String args[]){
	 
		Scanner reader = new Scanner(System.in);
	
		System.out.print("Enter a Time:");
		int T=reader.nextInt();
	
	if(T>=5)
		if(T<=12)
		System.out.println("Good Morning");
		else
		System.out.println("Please enter a time between 5 am to 12 am.");

	else
	System.out.println("Please enter a time between 5 am to 12 am.");




}

}