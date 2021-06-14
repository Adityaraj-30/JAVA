/*
We use the FileWriter class together with its write() method to write some text to the file 
Note- when we are done writing to the file, we should close it with the close() method:
*/

import java.io.FileWriter;  // Import the File class
public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter=new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        } catch (Exception e) {  //to handle exception
            
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
