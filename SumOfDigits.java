package whileloopinJava;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		int temp=n;
		int lastdigit=0;
		
		while(temp>0) {
//			it gives the last digit of a number
			lastdigit=temp%10;
			
			sum=sum+lastdigit;
			
//			to reduce the number
//			we use this also temp/=10 => temp=temp/10
			temp=temp/10;	
			
		}
		
		System.out.println("the sum of digits of "+ n +" is "+sum );

	}

}
