package whileloopinJava;
import java.util.Scanner;

public class Palindromeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int reverse=0;
		int temp=n;
		int lastdigit=0;
		
		while(temp>0) {
//			it gives the last digit of a number
			lastdigit=temp%10;
			
//			it is a equation for reverse number
			reverse=reverse*10+lastdigit;
			
//			to reduce the number
			temp=temp/10;
			
		}
		
//		this check our number and reverse is equal or not
		if(n==reverse) {
			System.out.println("the given number "+ n +" is palindrome");
		}
		
		else {
			System.out.println("the given number "+ n +" is not palindrome");
			
		}
		
		
		
		
	}

}
