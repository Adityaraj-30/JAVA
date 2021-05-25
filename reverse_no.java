import java.util.Scanner;
public class reverse_no {
    public static void main(String args[])
    {
        int num1;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a  Number : ");
        num1 = scan.nextInt();
        int reverse =0;
        while(num1>0){
            int lastdigit=num1%10;
            reverse = reverse*10 + lastdigit;
            num1=num1/10;
        }
        
    System.out.println("The reverse of number is : " + reverse);
    scan.close();

    }

}
