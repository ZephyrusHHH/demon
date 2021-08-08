package lec03;

public class ifClass {
    public static void main(String[] args) {
        int i = 0;
        int c = 1;

        if (true) {
            System.out.println("0");
        } else {
            System.out.println("pass");
        }
        while (i < 10) {

            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        i = 0;
        do {
            i++;
            System.out.print(i + " ");
        } while (i < 10);


    }


}
