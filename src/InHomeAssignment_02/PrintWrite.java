package InHomeAssignment_02;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWrite {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\MC\\oopRunningCourse()\\src\\InHomeAssignment_02\\input_file.txt");
        PrintWriter writer = new PrintWriter("C:\\Users\\MC\\oopRunningCourse()\\src\\InHomeAssignment_02\\generated_file.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext())
            {
                try {
                    String str = scanner.nextLine();

                    for (int i = 0; i < 2; i++) {
                        writer.println(str);
                        writer.println();
                        str = scanner.nextLine();
                    }

                    writer.println(str);
                    writer.println();
                    writer.println();
                    str = scanner.nextLine();
                }

                catch(Exception e) {
                    //
                }
            }
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

        writer.close();
    }
}