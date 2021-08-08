package lec03;

import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {

        int[] test = new int[8];
        System.out.println(Arrays.toString(test));

        //For loop copy
        int[] source = {10, 30, 20, 40};

        //int len = source.length;
        //target array
        int[] target = new int[source.length];


        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }

        //array print
        System.out.println(target);//object name

        System.out.println(Arrays.toString(target)); //1

        for (int i = 0; i < target.length; i++) {
            System.out.print(target[i] + " ");
        }//2

        System.out.println("");
        for (int a : target) {
            System.out.println(a);
        }//3


        //System arraycopy()
        int[] a = {1, 2, 3, 4};
        int[] b = {8, 7, 6, 5, 4, 3, 2, 1};

        // System.arraycopy(a, 0, b, 0, a.length);

        // System.out.println(Arrays.toString(b));

        System.arraycopy(a, 0, b, 3, 1);
        System.out.println(Arrays.toString(b));

        //copyof() copyofrange()

        int[] numbers = {10, 20, 30};
        int[] newArray = Arrays.copyOf(numbers, 2);


        System.out.println(Arrays.toString(newArray));
        int[] newArray2 = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(newArray2));

        int[] newArray3 = Arrays.copyOfRange(numbers, 1, 3);
        System.out.println(Arrays.toString(newArray3));


    }
}
