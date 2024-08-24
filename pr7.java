import java.util.Scanner;
public class pr7{
	public static void main(String args[]){
	
	
	Scanner reader=new Scanner(System.in);
	System.out.print("Enter First No.:");
	int N1=reader.nextInt();
	System.out.print("Enter Second No.:");
	int N2=reader.nextInt();
	System.out.print("Enter Third No.:");
	int N3=reader.nextInt();

	if (N1>N2){
		if(N1>N3)
		System.out.println(N1+" is largeat No.");
		else
		System.out.println(N3+" is largest No,");
	}
	else{
		if(N2>N3)
		System.out.println(N2+" is largeat No.");
	
		else
		System.out.println(N3+" is largeat No.");
	}
	
}


}
