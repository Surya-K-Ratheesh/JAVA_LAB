import java.util.*;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int flag = 0, len, i;
        String str; 

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        len = str.length();

        for(i = 0; i < len; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println(str+" is a PALINDROME");
        }

        else{
            System.out.println(str+" is not a PALINDROME");
        }  

        sc.close();
    }
}
