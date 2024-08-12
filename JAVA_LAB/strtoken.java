import java.util.*;
public class strtoken {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER INTEGERS WITH ONE SPACE GAP: ");
        String s =  sc.nextLine();

        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum += n;
        }

        System.out.println("SUM OF INTEGERS IS: "+sum);
        sc.close();
    }
}
