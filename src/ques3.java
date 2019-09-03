package Practice;

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        double fahrenheit;
        double celcius;
        Scanner k = new Scanner(System.in);
        fahrenheit = k.nextDouble();
        celcius = (fahrenheit - 32) / 1.8;
        System.out.println(celcius);
    }

}
