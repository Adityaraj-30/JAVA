/*
1) Design a class Complex having a real part (x) and an imaginary part (y). Provide methods
to perform the following on complex numbers:
a) Add two complex numbers.
b) Multiply two complex numbers.
c) toString() method to display complex numbers in the form: x + i y
**/
import java.util.Scanner;
class Complex
{
    private int x;
    private int y;

    public Complex(int real , int imaginary){   //Parameterized constructor
        this.x=real;
        this.y=imaginary;
    }

    public Complex add(Complex o){  //Adding complex object
        return new Complex(this.x +o.x, this.y +o.y);
    }

    public Complex multiply(Complex o){ //Multiply complex object
        return new Complex(this.x*o.x - this.y*o.y, this.x*o.y + o.x*this.y);

    }

    public String toString(){ //Type conversion to String
        return x + "+i" +y;
    }

}
public class ComplexDemo {
   public static void main(String[] args) {

    int real,imaginary;
    Scanner read=new Scanner(System.in);
    System.out.println("Enter the value of real part of number1 :");
    real=read.nextInt();
    System.out.println("Enter the value of imaginary part of number1 :");
    imaginary=read.nextInt();
    Complex C1=new Complex(real,imaginary);
    C1.toString();
    System.out.println("Enter the value of real part of number2");
    real=read.nextInt();
    System.out.println("Enter the value of imaginary part of number2");
    imaginary=read.nextInt();
    Complex C2=new Complex(real,imaginary);
    C2.toString();
  
    System.out.println("Complex1:"+C1);
    System.out.println("Complex2:"+C2);
    System.out.println("Sum:"+C1.add(C2));
    System.out.println("Product:"+C1.multiply(C2));

    read.close();
    }
    
}