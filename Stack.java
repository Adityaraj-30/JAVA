/**
 * Question 5: Write a program to implement stack. Use exception handling to 
 * manage underflow and overflow conditions.
 */

import java.util.Scanner;

public class Stack {

	    int cap,top,stud[];
	    Stack(int max) //Parameterized Constructor
	    {
	        top=-1;
	        cap=max;
	        stud=new int[cap];
	    }
	    public void push(int n) throws OverflowException //Function to push values in stack
	    {
	        if(top==cap-1)
	        	throw new OverflowException();
	        else
	        stud[++top]=n;
	    }
	    public int pop() throws UnderflowException //Function to pop values from stack
	    {
	        int k=-999;
	        if(top<0)
	        	throw new UnderflowException();
	        else
	            k=stud[top--];
	        return k;
	    }
	    public void display() throws UnderflowException //Display function
	    {
	    	int k;
	    	if(top<0)
	    		throw new UnderflowException();
	    	else
	    	{
	    		for(k=top;k>=0;k--)
	    			System.out.println(stud[k]);
	    	}
	    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int s=sc.nextInt();
		Stack ob=new Stack(s);
		int ch=0;
		while(1>0)
		{
			System.out.println("\nEnter the choice\n1 to push in stack\n2 to pop from stack\n3 to print stack\n4 to Exit Program");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:try {
					System.out.println("Enter number to be pushed in stack");
					int v=sc.nextInt();
					ob.push(v);
					break;
				}
				catch(OverflowException e)
				{
					System.out.println(e);
					break;
				}
				case 2:try {
					ob.pop();
					break;
				}
				catch(UnderflowException e)
				{
					System.out.println(e);
					break;
				}
				case 3:try {
					ob.display();
					break;
				}
				catch(UnderflowException e)
				{
					System.out.println(e);
					break;
				}
				case 4:System.exit(0);
						break;
				default:System.out.println("Wrong,choice enterred");		
			}
            sc.close();
		}
	}

}

class OverflowException extends Exception{
	
	public String toString()
	{
		return "OVERFLOW";
	}
}
class UnderflowException extends Exception{
	
	public String toString()
	{
		return "UNDERFLOW";
	}
}