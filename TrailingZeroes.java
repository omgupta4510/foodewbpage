import java.util.*;

public class TrailingZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        long p = 5;
        while (n / p > 0) {
            ans += n / p;
            p *= 5;
        }
        System.out.println(ans);
    }
}
