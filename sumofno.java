import java.util.Scanner;
public class sumofno{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        //    int num=7832;
        int num=sc.nextInt();
        int sum=0;
        int dig;
        while(num>0){
            dig=num%10;
            sum=sum+dig;
            num=num/10;
        }
        System.out.println("Sum of the digits is "+ sum);
        sc.close();
    }
}