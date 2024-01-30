import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j, k;
        int n, m, q;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();;
        String[] s = new String[n];
        for(int p = 0; p < n; p++){
            s[p] = scanner.nextLine();
        }
        int[] a = new int[m];
        for(i = 0; i < m; i++)
            a[i] = scanner.nextInt();
        long ans = 0;
        HashMap<char, long> mp = new HashMap<char, long>();
        for(i = 0; i < m; i++)
        {
            mp.clear();
            for(j = 0; j < n; j++)
                mp[s[j].charAt(i)]++;
            ll mx = 0;
            for(j = 0; j < 5; j++)
                mx = max(mx, mp[j + 'A'] * a[i]);

            ans += mx;
        }
        pfl(ans);
    }
}