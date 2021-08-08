import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name);

        int age = scanner.nextInt();
        System.out.println(age);


    }
}
