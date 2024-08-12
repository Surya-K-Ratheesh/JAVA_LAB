import java.util.*;

public class recur_sum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int result = sum(n);
        System.out.println(result);

        sc.close();
    }

    public static int sum(int k){
        if(k > 0){
            return k + sum(k - 1);
        }
        else{
            return 0 ;
        }
    }
}
