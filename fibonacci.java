package patikadev;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int counter, result = 0, n1 = 0, n2 = 1, n;
        System.out.println("eleman sayısını giriniz:");
        counter = inp.nextInt();
        for (int i = 2; i <= counter; i++) {
            n = n1 + n2;
            System.out.println(n1 + "+" + n2 + "=" + n);
            n1 = n2;
            n2 = n;
        }

    }
}
