package Practice;

//import java.security.spec.RSAOtherPrimeInfo;

import java.util.Scanner;

public class Sahas {
    public static void main(String[] args) {
        double s = 0.0;
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            s = s + (1.0 / i);
        }
        System.out.println(s);
    }
}
