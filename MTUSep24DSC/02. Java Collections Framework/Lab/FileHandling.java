package Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C://Users//User//Downloads//hamlet.txt"; // this changes depending where you have the file
    //Updated the file name as it was causing errors
        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    System.out.println("''"+ word + lineNumber);
                }
                in.close(); 
                lineParser.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
