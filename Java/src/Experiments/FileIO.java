package Experiments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws IOException {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        String folder = "/Users/jaejungscene/Projects/Programming_Language/Java/src/Experiments/";
        // Try block to check for exceptions
        try {

            // Passing the files via local directory
            sourceStream = new FileInputStream(folder + "demo.txt");
            targetStream = new FileOutputStream(folder + "demo-copy.txt");

            // Reading source file and writing content to
            // target file byte by byte
            int temp;

            // If there is content inside file
            // than read
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);

            // Display message for successful execution of program
            System.out.print("Program successfully executed");
        }

        // finally block that executes for sure
        // where we are closing file connections
        // to avoid memory leakage
        finally {

            if (sourceStream != null)
                sourceStream.close();

            if (targetStream != null)
                targetStream.close();
        }
    }
}
