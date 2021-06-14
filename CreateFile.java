/* 
To create a file in Java, we use the createNewFile() method. This method returns a boolean value:
 true if the file was successfully created, and false if the file already exists. 
 Note that the method is enclosed in a try...catch block. 
 This is necessary because it throws an IOException if an error occurs (if the file cannot be created for some reason):
*/

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } 
      else {
        System.out.println("File already exists.");
      }
    } 
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
