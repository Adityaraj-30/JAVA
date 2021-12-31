package JAVA.Basic;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("Enter Your Roll No:");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your Roll no is " + rollno);
        

        input.close();
    }
}
