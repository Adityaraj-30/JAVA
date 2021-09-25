// /**
//  * 6)Write a program to implement stack. Use exception handling to manage underflow and
// overflow conditions.
//  */

// import java.io.*;

// public class Copy {

//     public static void copy(String x, String y) throws IOException {
//         FileInputStream fileInputStream = new FileInputStream(x);
//         FileWriter fileWriter = new FileWriter(y, false);
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
//         String string;
//         while ((string = bufferedReader.readLine()) != null) // reading from input file
//         {
//             fileWriter.write(string); // writing in output file
//             fileWriter.write("\n");
//         }
//         fileInputStream.close(); // closing input file
//         fileWriter.close(); // closing output file
//     }

//     // public static void main(String[] args) {
//     //     try {
//     //         if (args.length != 2) {
//     //             throw new InvalidArgumentException();
//     //         } else
//     //             copy(args[0], args[1]);

//     //     } catch (IOException e) {
//     //         e.printStackTrace();
//     //     } catch (InvalidArgumentException e) {
//     //         System.out.println(e);
//     //     }
//     // }
// //}

// // class InvalidArgumentException extends Exception {
// //     public String toString() {
// //         return ("Invalid Number of arguments");
// //     }
// // }
