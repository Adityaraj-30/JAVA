import java.util.Scanner;
public class factor_prime {
    static boolean factor(int num){
        for(int i = 1; i <= num; ++i){
           
            if(num % i == 0)
           System.out.println(i);
       }
       return false ;
       
    }
    
    static boolean PrimeFactors(int num) {
    
       for (int i = 2; i <= sqrt(num); i++){
          if (num%i == 0){
             return false;
          }
       }
       return true;
       
    }

    private static int sqrt(int num) {
        return 0;
    }
   
    public static void main(String[] args)
	{
        int a;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input a  Number : ");
        a = scan.nextInt();
        System.out.print(factor(a));
        System.out.print(PrimeFactors(a));
        scan.close();
        

    }
    
}
