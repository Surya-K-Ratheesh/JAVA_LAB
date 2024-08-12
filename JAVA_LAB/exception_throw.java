public class exception_throw {
    public static void main(String[] args){
        try{
            throw new RuntimeException("This is a custom exception message.");
        } 
        catch (RuntimeException e){
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
