import java.util.*;

public class oc {
    public static void main(String[] args) {
        String str;
        char ch;
        int count = 0, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER A STRING: ");
        str = sc.nextLine();

        System.out.print("ENTER A CHARACTER: ");
        ch = sc.nextLine().charAt(0);

        for(i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }

        System.out.println("COUNT OF OCCURANCE OF "+ch+" = "+count);
        sc.close();
    }
}
