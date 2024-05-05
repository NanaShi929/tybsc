//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Scanner;
//
//public class Test {
//    public static void main(String[] args) {
//        NumberProcessor numberProcessor = new NumberProcessor();
//
//        // Read input from a CSV file
//        try {
//            Path file = Paths.get("input.csv");
//            int count = (int)(Files.lines(file).count());
//            NumberProcessor[] Np = new NumberProcessor[count];
//            FileInputStream fis=new FileInputStream("input.csv");
//            Scanner sc=new Scanner(fis);
//            String line;
//               while (sc.hasNextLine()) {
//                   line = sc.nextLine();
//                   String[] fields = line.split(",");
//                if (fields.length == 5) {
//                    for (String field : fields) {
//                        int number = Integer.parseInt(field);
//                        numberProcessor.addNumber(number);
//                        System.out.print(number + " ,");
//                    }
//                    System.out.println("Sum: " + numberProcessor.getSum() + ", Average: " + numberProcessor.getAverage());
//                }
//
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
////import java.io.FileInputStream;
////import java.io.IOException;
////import java.util.Scanner;
////
////public class Test {
////    public static void main(String[] args) {
////        NumberProcessor numberProcessor = new NumberProcessor();
////
////        try {
////            FileInputStream fis = new FileInputStream("input.csv");
////            Scanner sc = new Scanner(fis);
////            sc.useDelimiter("\n"); // Set delimiter to newline character
////
////            while (sc.hasNext()) {
////                String line = sc.next(); // Read the entire line
////                String[] fields = line.split(",");
////                if (fields.length == 5) {
////                    for (String field : fields) {
////                        int number = Integer.parseInt(field);
////                        numberProcessor.addNumber(number);
////                        System.out.print(number + " ,");
////                    }
////                    System.out.println("Sum: " + numberProcessor.getSum() + ", Average: " + numberProcessor.getAverage());
////                }
////            }
////
////            sc.close();
////            fis.close();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
////}
//
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Read input from a CSV file
        try {
            FileInputStream fis = new FileInputStream("input.csv");
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                NumberProcessor numberProcessor = new NumberProcessor(); // Create a new instance for each row
                String line = sc.nextLine();
                String[] fields = line.split(",");
                if (fields.length == 5) {
                    for (String field : fields) {
                        int number = Integer.parseInt(field);
                        numberProcessor.addNumber(number);
                        System.out.print(number + " ,");
                    }
                    System.out.println("Sum: " + numberProcessor.getSum() + ", Average: " + numberProcessor.getAverage());
                }
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
