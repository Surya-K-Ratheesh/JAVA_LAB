import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fh {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("sample.txt");
            FileWriter writer = new FileWriter("new.txt",true);

            int character;

            while((character = reader.read()) != -1){
                System.out.println((char)character);
                writer.write((char)character);
            }

            reader.close();
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
