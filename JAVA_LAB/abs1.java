abstract class Animal{
    public abstract void AnimalSound();
    public void sleep(){
        System.out.println("Zzz");
    } 
}

class Pig extends Animal{
    public void AnimalSound(){
        System.out.println("Pig says: Wee Wee");
    }
}

public class abs1 {
    public static void main(String [] args){
        Pig mypig = new Pig();

        mypig.AnimalSound();
        mypig.sleep();
    }        
}
