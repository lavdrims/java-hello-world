package Exercises.Exercise6;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        try {
            // Writer.
            String[] names = {"John.", "Carl.", "Mary."};

            // absolute path can be written like: "C:\\Users\\lavdrim.selimi\\Source\\TA_training"
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("This is my first line.");
            writer.write("\nAnother line here.");

            for (String name: names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            // Reader.
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
}
