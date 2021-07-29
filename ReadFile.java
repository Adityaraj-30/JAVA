// We use the Scanner class to read the contents of the text file //

// import java.io.File;  // Import the File class
// import java.io.FileNotFoundException;   // Import this class to handle errors
// import java.util.Scanner;  // Import the Scanner class to read text files
// public class ReadFile {
//     public static void main(String[] args) {
//         try {
//             File myObj=new File("filename.txt");
//             Scanner myReader = new Scanner(myObj);
//             while(myReader.hasNextLine()){
//                 String data=myReader.nextLine();
//                 System.out.println(data);
//             }
//             myReader.close();
//         } catch (FileNotFoundException e) { //TO handle exception
            
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }

/*Question 7: Write a program to read a file and display only those lines that have the first 
two characters as '//' (Use 		try with resources)
*/

import java.io.*;

public class ReadFile{
    static void read(){ //function to readgile
        try{
            File file = new File("filename.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string;
            while((string=bufferedReader.readLine())!=null){
                if(string.charAt(0)=='/'&& string.charAt(1)=='/')
                System.out.println(string);
              
            }
            bufferedReader.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }catch(IOException e){
            e.printStackTrace();
        }
          
    }
    public static void main(String[] args) {
        read();
        
    }
}
