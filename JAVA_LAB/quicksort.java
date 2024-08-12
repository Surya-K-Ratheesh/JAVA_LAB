import java.util.*;

public class quicksort{
    int partition(String str[], int low, int high){
        String pivot = str[high];
        int i = (low - 1);
        for(int j = low; j < high; j++){
            if(str[j].compareTo(pivot) <= 0){
                i += 1;
                String temp = str[i];
                str[i] = str[j];
                str[j] = temp; 
            }
        }

        String temp = str[i + 1];
        str[i + 1] = str[high];
        str[high] = temp;

        return i + 1;
    }

    void sort(String str[], int low, int high){
        if(low < high){
            int pi = partition(str, low, high);
            sort(str, low, pi-1);
            sort(str, pi+1, high);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = new String[30];
        int n, i; 

        System.out.print("ENTER THE NO. OF NAMES: ");
        n = sc.nextInt();
        n += 1;

        System.out.println("ENTER THE NAMES: ");
        for(i = 0; i < n; i++){
            str[i] = sc.nextLine();
        }
    }
}