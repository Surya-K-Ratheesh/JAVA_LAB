interface firstInterface{
    public void myMethod();
}

interface secondInterface{
    public void myOtherMethod();
}

class DemoClass implements firstInterface, secondInterface{
    public void myMethod(){
        System.out.println("Some Text");
    }

    public void myOtherMethod(){
        System.out.println("Some Other Text");
    }
}

public class multi_inherit {
    public static void main(String args[]){
        DemoClass myobj = new DemoClass();
        myobj.myMethod();
        myobj.myOtherMethod();
    }
}
