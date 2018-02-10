import java.io.*;

public class Base {

    static void doTask(String input) {

        // do something

    }

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader(new File("downloads/JudgingInputs/Prob00.in.txt")))) {

            String line;
            while((line = reader.readLine()) != null) {
                doTask(line);
            }

        } catch(IOException e) { e.printStackTrace(); }

    }

}
