import java.io.*;
import P1.*;
import P2.*;
import P3.*;

public class Main {
    static int getShapeType() throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("======= SHAPE TYPE =======");
        System.out.println("1) Rectangle\n2) Circle ");
        System.out.print("Enter Your Choice: ");
        return Integer.parseInt(br.readLine());
    }
    public static void main(String[] args) throws IOException {
        Shape s;
        boolean flag= false;
        while(!flag){
            switch(getShapeType()){
                case 1:
                  flag=true;
                  s=new Rectangle();
                  System.out.println("Area of Rectangle is: "+s.area()+" sq units");
                break;
                case 2:
                  flag=true;
                  s=new Circle();
                  System.out.println("Area of Circle is: "+s.area()+" sq units");
                break;
                default:
                  System.out.println("Invalid Option");  
                break;  

            }
        }
    }
    
}
