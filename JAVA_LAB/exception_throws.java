import java.io.*;
class throws_example {
    void MyMethod(int num) throws IOException, ClassNotFoundException{
        if (num == 1){
            throw new IOException("IOException Occurred");
        }
        else{
            throw new ClassNotFoundException("ClassNotFoundException");
        }
    }
}

public class exception_throws{
    public static void main(String args[]){
        try{
            throws_example obj = new throws_example();
            obj.MyMethod(1);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
} 