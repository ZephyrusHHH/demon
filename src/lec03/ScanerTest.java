package lec03;

import java.util.Arrays;
import java.util.Scanner;

public class ScanerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a);

        int[] b = {1, 2, 3, 4};
        System.out.println(Arrays.toString(b));
    }
}

