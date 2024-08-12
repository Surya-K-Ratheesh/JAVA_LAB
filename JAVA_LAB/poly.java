abstract class shape{
    public abstract void numberofSides();
}

class rectangle extends shape{
    public void numberofSides(){
        System.out.println("Number of sides of rectangle = 4");
    }
}

class triangle extends shape{
    public void numberofSides(){

    }
}

class hexagon extends shape{
    public void numberofSides(){

    }
} 

public class poly{
    public static void main(String[] args) {
        rectangle r = new rectangle();
        triangle t = new triangle();
        hexagon h = new hexagon();
        
        r.numberofSides();
        t.numberofSides();
        h.numberofSides();
    }
}