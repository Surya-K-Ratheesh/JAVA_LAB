import java.util.*;

public class occurance {
    public static void main(String [] args){
        String str;
        char ch;
        int count, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        System.out.print("Enter a character: ");
        ch = sc.nextLine().charAt(0);

        count = 0;

        for(i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }

        System.out.println("Count of Occurance of "+ch+" = "+count);

        sc.close();
    }
}
