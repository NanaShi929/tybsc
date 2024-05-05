import java.nio.file.Path;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try {


            Path file = Path.of("Numbers.csv");
            int count = (int) (Files.lines(file).count());
            FileInputStream fis = new FileInputStream("Numbers.csv");
            Scanner sc = new Scanner(fis);
            Integer line;
            int iter = 0;
            Integer[] flds;
            Math[] math = new Math[0];
            while (sc.hasNextInt()) {
                line = sc.nextInt();
                flds = new Integer[]{line};


                math = new Math[0];
                math[iter] = new Math(flds[0], flds[1], flds[2], flds[3], flds[4]);
                ++iter;
            }
            sc.close();
            Math ma = new Math();

            System.out.println(ma.toDouble());


        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
