import java.util.Scanner;

class Matrix 
{
	int matrix[][],row,column;
	Matrix()
	{
		row=0;
		column=0;
		matrix=new int[row][column];
	}
	Matrix(int r,int c)
	{
		row=r;
		column=c;
		matrix=new int[row][column];
	}
	void input()
	{
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				matrix[i][j]=read.nextInt();
              read.close();              
	}
	Matrix Add(Matrix mat2)  //Add Function to add two similar matrices
	{
		if(row!=mat2.row||column!=mat2.column)
		{
			System.out.println("Matrices cannot be added");
			System.exit(0);
		}
		Matrix result=new Matrix(row,column);
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				result.matrix[i][j]=matrix[i][j]+mat2.matrix[i][j];
		return result;		
	}
	Matrix Product(Matrix mat2) //Function to multiply two matrices
	{
		if(column!=mat2.row)
		{
			System.out.println("Matrices cannot be multiplied");
			System.exit(0);
		}
		Matrix result=new Matrix(row,mat2.column);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<mat2.column;j++)
			{
				result.matrix[i][j]=0;
				for(int k=0;k<column;k++)
					result.matrix[i][j]+=matrix[i][k]*mat2.matrix[k][j];
			}
		}
		return result;		
	}
	Matrix Transpose() //Function to create Transpose of matrix Matrix
	{
		Matrix result=new Matrix(column,row);
		for(int i=0;i<column;i++)
			for(int j=0;j<row;j++)
				result.matrix[i][j]=matrix[j][i];
		return result;
	}
	void display() //Function to display Matrix
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
		}
	}
}

public class MatrixDemo 
{

	public static void main(String[] args)
	{
		int row,column;
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the row size of Matrix");
		row=read.nextInt();
		System.out.println("Enter the column size of Matrix");
		column=read.nextInt();
		Matrix ob=new Matrix(row,column);
		ob.input();
		System.out.println("Enter the choice \n 1 for Addition \n 2 for Multiplication \n 3 for Transpose");
		int ch=read.nextInt();
		switch(ch)
		{
			case 1:
			{
				int matrix,b;
				System.out.println("Enter row and column size of Matrix 2");
				matrix=read.nextInt();
				b=read.nextInt();
				Matrix ob1=new Matrix(matrix,b);
				ob1.input();
				Matrix ob2=ob1.Add(ob);
				System.out.println("First Matrix is :");
				ob.display();
				System.out.println("\n Second Matrix is :");
				ob1.display();
				System.out.println("\n Added Matrix is :");
				ob2.display();
				break;
			}
			case 2:
			{
				int matrix,b;
				System.out.println("Enter row and column size of Matrix 2");
				matrix=read.nextInt();
				b=read.nextInt();
				Matrix ob1=new Matrix(matrix,b);
				ob1.input();
				Matrix ob2=ob.Product(ob1);
				System.out.println("First Matrix is: ");
				ob.display();
				System.out.println("\n Second Matrix is: ");
				ob1.display();
				System.out.println("\n Multiplied Matrix is : ");
				ob2.display();
				break;
			}	
			case 3:
			{
				Matrix ob1=ob.Transpose();
				System.out.println("Original Matrix");
				ob.display();
				System.out.println("\n Transpose Matrix ");
				ob1.display();
				break;
			}	
			default:
			{
				System.out.println("Wrong Choice,Program Exit");
				System.exit(0);
			}	
		}
              read.close();		
	}

}