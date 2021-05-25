import java.util.Scanner;

public class Series2 {

    double  fact(int n){
    double fact=1;
   for(int x=n;x>0;x--)
      {
        fact*=x;
      }
      return fact;
}//factorial
    
    
double ser(int n)
{   float sum=0;
     for(int x =n; x >0; x--)
     {
        sum+= 1/fact( x );
     }
     return sum;
             
}//series
    public static void main(String[] args) {   
        Series2 p=new Series2( );
       Scanner in = new Scanner(System.in); 
    System.out.print("Enter Number: ");
    int n = in.nextInt();
    System.out.println("Sum: " + p.ser(n));

    in.close();
    
    }
    
}
    

