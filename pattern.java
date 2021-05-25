import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n1) Design Pattern 1"+"\n2) Design Pattern 2" +"\n3) Design Pattern 3" +"\n4) Design Pattern 4" +"\n5) Design Pattern 5" +"\n6) Design Pattern 6");
        System.out.println("\nEnter your choice:");
        int m = sc.nextInt();

        if(m==1)
        {
            System.out.println("\nEnter number of rows:  ");
            int n = sc.nextInt();
            System.out.println("\nPattern 1 is ");

            for(int a = 1; a <= n; a++)
            {
                for(int b = 1; b <= n-a; b++)
                {
                    System.out.print(" ");
                }
                for(int c = 1; c <= a; c++)
                {
                    System.out.print("*");
                }
                for(int d = a-1; d >= 1; d--)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        else if(m==2)
        {
            System.out.println("Enter number of rows:  ");
            int n = sc.nextInt();
            System.out.println("\nPattern 2 is ");

            for(int a = 1; a <= n; a++)
            {
                for(int b = 1; b <= a; b++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        else if(m==3)
        {
            System.out.println("Enter number of rows:  ");
            int n = sc.nextInt();
            System.out.println("\nPattern 3 is ");
            for(int a = 1; a <= n; a++)
            {
                for(int b = 1; b <= n-a; b++)
                {
                    System.out.print(" ");
                }
                for(int c = a; c>=1; c--)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        else if(m==4)
        {
            System.out.println("Enter no. of rows: ");
            int n = sc.nextInt();
            System.out.println("\nPattern 4 is ");
            for(int a = 1; a <= n; a++)
            {
                for(int b = 1; b <= n-a; b++)
                {
                    System.out.print(" ");
                }
                for(int c = 1; c <= a; c++)
                {
                    System.out.print("*");
                }
                for(int d = a-1; d >= 1; d--)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            for(int e=1; e<=(n-1); e++)
            {
                for(int f=e; f>=1; f--)
                {
                    System.out.print(" ");
                }
                for(int k=(n-e); k>=1; k--)
                {
                    System.out.print("*");
                }
                for(int l=(n-e-1); l>=1; l--)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        else if(m==5)
        {
            System.out.println("Enter number of rows: ");
            int n = sc.nextInt();
            System.out.println("\nPattern 5 is ");
            for(int a=1;a<=n;a++)
            {
                for(int b=1; b<=n-a; b++)
                {
                    System.out.print(" ");
                }
                for(int c=1; c<=a; c++)
                {
                    System.out.print(c);
                }
                for(int d=a-1; d>=1; d--)
                {
                    System.out.print(d);
                }
                System.out.print("\n");
            }

        }
        else if(m==6)
        {
            System.out.println("Enter number of rows: ");
            int n = sc.nextInt();
            System.out.println("\nPattern 6 is ");
            for(int i=0; i<n; i++)
            {
                for(int j=65; j<=(64+n)-i; j++)
                    System.out.print((char)j);
                for(int k=1; k<=i* 2-1; k++)
                    System.out.print(" ");

                if(i==0)
                    System.out.print("\b");

                for(int x=(64+n)+i; x<=(68+n); x++)
                    System.out.print((char)x);
                System.out.print("\n");
            }
        }

        else
        {
            System.out.println("Wrong choice");
        }
        sc.close();
    }
}


