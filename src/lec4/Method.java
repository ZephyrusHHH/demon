package lec4;

import java.util.Arrays;

import static java.lang.Math.min;

public class Method {
    /*
     * methods in the same class can be used each other,
     * but notice the instance method can use all other methods in this class
     * however the class method can only use other class methods
     *
     * When the class file is loaded into memory, the instance method will not be allocated memory space, which will be
     * allocated only after the object is created. The class method allocates the corresponding memory space when the
     * class is loaded into memory.
     *
     * Instance methods can operate on both class variables and instance variables.
     * Class methods can only access other static methods.
     * Class methods can only access other static data and class variables.
     *
     * */
    float a, b;
    static float x_s;

    void sum(float x, float y) {
        this.a = max(x, y);
        b = this.min(x, y);
    }

    static float getMax(float x, float y) {
        float c;
        c = max(x, y) * max(x, y);

        //x_s = x + 1;
        return c;
    }

    static float max(float x, float y) {
        return x <= y ? y : x;
    }

    float min(float x, float y) {
        return x <= y ? x : y;
    }

    static void add_one(int[] x) {
        x[0] = x[0] + 1;
    }

    static void strAddOne(String y) {
        y = y + "text";
    }

    static void print(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

    }

    void lodsadas(int a) {
        this.a=0;
        a=0;

    }


    public static void main(String[] args) {
        Method method_1 = new Method();
        method_1.a = 0;
        //method_1.min();


        int[] a_1 = {1, 2, 3, 4};
        System.out.println(a_1);
        System.out.println(a_1[0]);
        int b_1 = a_1[0];
        b_1 = 2;
        System.out.println(a_1[0]);

        int[][] a = {{2, 3, 4, 5}, {2}, {3}, {4}};
        System.out.println(a);
        System.out.println("-----------");
        a_1 = a[0];
        a_1[0]++;
        System.out.println(a_1);
        System.out.println(Arrays.toString(a[0]));
        System.out.println("-------------------");
        System.out.println(Arrays.toString(a));
        int[] b = a[0];
        //b[0] = 2;
        //a[0][0]=2;
        System.out.println(Arrays.toString(a[0]));
        add_one(b);
        System.out.println(Arrays.toString(a[0]));
        //x_s = 0.0f;
        //getMax()


        String txt = "123";
        strAddOne(txt);
        System.out.println(txt);
        System.out.println("------------------");
        System.out.println(args);
        print("test", "123123");
        int x = 0;
        int y = 2;
        x = (x <= y ? y : x);
        System.out.println(x);
    }
}

