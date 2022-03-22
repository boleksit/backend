package src.com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class splitFileIntoLines {
    public static void main (String[] args)
    {
        try{
            Scanner scanner = new Scanner(new File("file.txt"));
            int i=1;
            while (scanner.hasNextLine())
            {
                System.out.println(i++ +": "+scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
