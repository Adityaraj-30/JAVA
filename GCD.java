import java.util.Scanner;
public class GCD {
    
	static int gcd(int a, int b)
	{
	if (b == 0)
		return a;
	return gcd(b, a % b);
	}
	
	public static void main(String[] args)
	{
        int num1, num2;
         Scanner scan = new Scanner(System.in);
		
         System.out.print("Input a  Number : ");
         num1 = scan.nextInt();
         System.out.print("Input another  Number : ");
         num2 = scan.nextInt();
		//int a = 98, b = 56;
		System.out.println("GCD of " + num1 +" and " + num2 + " is " + gcd(num1, num2));
        scan.close();
	}
}

    