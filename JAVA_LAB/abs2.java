abstract class bike{
    abstract void run();
}

class Honda extends bike{
    void run(){
        System.out.println("Running Smoothly");
    }
}

public class abs2 {
    public static void main(String [] args){
        bike obj = new Honda();
        obj.run();
    }
}
