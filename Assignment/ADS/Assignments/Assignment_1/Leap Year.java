import java.util.Scanner;
class LeapYear{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int x=sc.nextInt();
        boolean leap=false;
        if(x%4==0){
            if(x%100==0){
                if(x%400==0){
                    leap= true;
                }
                else{
                    leap= false;
                }
            }
            else{
                 leap= true;
            }
        }
        else{
             leap= false;
        }
        System.out.println(x+" Leap year= "+leap);
        sc.close();
        
    }
}
