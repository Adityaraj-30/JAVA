//package com.Telusko;
public class c_notes {
   

/*
1.super(); by default is present in every constructor of child class.
2.super() has nothing inside it, hece it will always call the default constructor of parent class
3.super(i) will call the constructor defined with one parameter inside it.
4.super(i,j) will call the constructor defined with two parameter inside it. etc...
*/

class A{
    public A(){
        System.out.println("Class zero A constructer called");
    }
    public A(int i){
        System.out.println("Single Parameter A constructor");
    }
    public A(int i,int k){
        System.out.println("double parameter A constructor called");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("Class 0 B constructer called");
    }
    public B(int i){
        super(i);
        System.out.println("Parameterized 1 B constructor called");
    }
    public B(int i,int k){
        super(i,k);
        System.out.println("Parameterized 2 B constructor called");
    }
}

public class auSuperMethod {
    public static void main(String[] args) {

        //When we create a an object of the child class, It will also ...
        //..call the default constructor of the parent class

        
    }
}
    
}
