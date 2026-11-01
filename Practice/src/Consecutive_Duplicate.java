import java.util.Scanner;

public class Consecutive_Duplicate {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Cons_duplicate(arr, N) );
    }

        public static boolean Cons_duplicate (int[] arr, int N){
            int numm = arr[0];
            for (int i = 1; i < N; i++) {
                if (numm == arr[i]) {     // OR [arr[i-1]==arr[i]]    return true;     else return false;
                    return true;
                } else {
                    numm = arr[i];
                }
            }
            return false;
        }
}




