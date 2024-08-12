import java.util.*;

public class pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0, len, i;
        String str;

        System.out.print("ENTER A STRING: ");
        str = sc.nextLine();

        len = str.length();

        for(i = 0; i < len; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                flag = 1;
                break;
            }
        }

        System.out.println();

        if(flag == 0){
            System.out.println(str+" IS A PALINDROME");
        }
        else{
            System.out.println(str+" IS NOT PALINDROME");
        }
    }
}
