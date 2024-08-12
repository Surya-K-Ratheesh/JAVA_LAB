interface Animal{
    public void animalSound();
    public void sleep();
}

class Pig implements Animal{
    public void animalSound(){
        System.out.println("The Pig says: Wee Wee");
    }
    public void sleep(){
        System.out.println("Zzz");
    }
}

public class interfacee{
    public static void main(String args[]){
        Pig mypig = new Pig();
        mypig.animalSound();
        mypig.sleep();
    }
}