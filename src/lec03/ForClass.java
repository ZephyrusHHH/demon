package lec03;

public class ForClass {
    public void forloop1() {
        int i, j;

        for (i = 1; i <= 10; i++) {
            System.out.println();

            for (j = 1; j <= 10; j++) {
                    System.out.print(j + " ");

                    if (j == 5)
                        break;          //Statement 1
            }
        }
    }

    public void forloop2() {
        int i, j;

        loop1:
        for (i = 1; i <= 10; i++) {
            System.out.println();

            loop2:
            for (j = 1; j <= 10; j++) {
                System.out.print(j + " ");

                if (j == 5)
                    break loop1;     //Statement 1
            }
        }
    }






    public static void main(String[] args) {
        ForClass forcls = new ForClass();
        forcls.forloop1();
        System.out.println("-------------------");
        forcls.forloop2();


        int i = 0;
        int c = 1;
        System.out.println("");

        while (i < 10 && c == 1) {
            System.out.print(i);
            i++;
        }

        System.out.println("");

        i = 0;
        do {
            System.out.print(i);
            i++;
        } while (i < 10);

    }
}
