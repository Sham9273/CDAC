/*Write a Java program that checks if a predefined number is positive using an 
if-else statement and prints the appropriate message.*/

// 1.METHOD

/*public class Pr1{
	public static void main(String args[]){
		int N=-5;
		if(N>0)
		{
		System.out.println("It is a Positive number");
		}
		else
		{
		System.out.println("It is a Negative number");
		}
	}
}*/

//2.METHOD
import java.util.Scanner;
public class Pr1{
	public static void main(String args[]){
	Scanner reader=new Scanner(System.in);
	System.out.print("Enter a Number:");
	int N=reader.nextInt();
	if(N>0)
	
	System.out.println("It is a Positive number");
	
	else if(N<0)
	
	System.out.println("It is a Negative number.");
	
	else
	
	System.out.println("It is a Zero.");
	

    }
}