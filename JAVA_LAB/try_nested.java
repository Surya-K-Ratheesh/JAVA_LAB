public class try_nested {
    public static void main(String args[]){
        try{
            try{
                System.out.println("Going to Divide");
                int b = 39/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }

            try{
                int a[] = new int[5];
                a[5] = 4;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println("Handled");
        }

        System.out.println("Normal Flow");
    }
}
