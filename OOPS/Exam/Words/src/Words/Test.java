package Words;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Words w1 = new Words("this is a constructor");
        Words w2 = new Words();
        w2.setWords("this is setter for words");
        Vowels v1 = new Vowels("this is a constructor");
        Vowels v2 = new Vowels();
        v2.setVowels("this is setter for vowels");
        StringWriter textBuilder = new StringWriter();
        try {
            Path file = Paths.get("input.csv");

            FileInputStream fis = new FileInputStream("input.csv");
            Scanner sc = new Scanner(fis);
            String line;

            while (sc.hasNextLine()) {
                line = sc.nextLine();

                textBuilder.append(line).append("\n");
            }

                sc.close();
                String text =textBuilder .toString();


                Words w3 = new Words();
                int word = w3.Words(text);
                System.out.println("Words: " + word);

            Vowels v3 = new Vowels();
                int vowel = v3.Vowels(text);
                System.out.println("Vowels: " + vowel);
            


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

