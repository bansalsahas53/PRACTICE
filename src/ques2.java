package Practice;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        double num;
        double paise = 0.0;
        int ruppee;
        Scanner k = new Scanner(System.in);
        num = k.nextDouble();
        ruppee = (int) num;
        paise = 100 * (num - ruppee);
        System.out.println(ruppee + "Ruppees and " + (int) paise + "Paise");
    }
}
