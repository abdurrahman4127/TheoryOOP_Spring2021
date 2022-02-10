package InHomeAssignment_02;

import java.io.*;

public class NewlineLine {

    public static void main(String[] args)
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\USER\\OOP_Theory_Spring_2021\\src\\InHomeAssignment_02\\input_file.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\USER\\OOP_Theory_Spring_2021\\src\\InHomeAssignment_02\\generated_file.txt"));

            String[] lines = new String[10000];

            //counting total numbers of lines
            int count = 0;
            while ((lines[count] = bufferedReader.readLine()) != null) {
                count++;
            }

            //going up to the last line
            for(int i=0; i<(count-1); i++)
            {
                if(lines[i].isEmpty()) {
                    bufferedWriter.write(lines[i] + "\n");
                }

                else {
                    bufferedWriter.write(lines[i] + "\n\n");
                }
            }

            bufferedWriter.write(lines[count-1]);  //writing the last line
            
            bufferedWriter.close();
        }

        catch(Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}