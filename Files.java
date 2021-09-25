import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Files extends Exception
{
public static void main(String[] args) throws FileNotFoundException, IOException
{  
  Scanner sc = new Scanner(System.in);
  char c = 'y';
  FileWriter f = new FileWriter("file1.txt",true);
  while(c == 'y')
  {
   for(int i=0;i<args.length;i++)  
     System.out.println(args[i]);  
  
    if(args.length==5)
     {
      Arrays.sort(args);
      for(int i=0;i<args.length;i++){ 
       System.out.println(args[i]); 
         f.write(args[i]);
       }
     }
    else if(args.length==0)
     {
        c = sc.next().charAt(0);
     }
    else if(args.length!=5||args.length!=0)
    {
        try{
            throw new Exception("No .of Arguments is not Valid, Try Again");
        }catch(Exception e)
        {
            System.out.println(""+e.getMessage());
        }
    }
  }
  f.close();
  sc.close();
}
  
}
