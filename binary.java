import java.util.Scanner;
public class binary {
    public static void main(String args[])
    {
       
        int dec_num, quot, i=1, j;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input a  Number : ");
        dec_num=scan.nextInt();
        int bin_num[] = new int[100];
        quot = dec_num;
        while(quot != 0)
        {
            bin_num[i++] = quot%2;
            quot = quot/2;
        }
		scan.close();
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
        
    }
    

}
    

