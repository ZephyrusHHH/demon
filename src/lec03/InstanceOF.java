package lec03;

import java.util.Arrays;

public class InstanceOF {
    public static void main(String[] args) {
        // (1)a instance of a class including instance from itself,
        // also include instance from direct/indirect subclasses

        // (2) The object instance on the left cannot be a primitive data type
        double d1 = 0.001;
        // if (d1 instanceof Double){}

        // (3) The object instance on the left
        // and the class on the right are not in the same inheritance tree
        String name = "test";
        if (name instanceof String){

        }
        //char[] test = name.toCharArray();
        //System.out.println(Arrays.toString(test));


        //if(name instanceof Double){}
        // (4) Null is false when compared with any type with instanceof

        A a = null;
        B b = null;
        D d = new D();

        boolean result;

        result = a instanceof A;
        //System.out.println(result);
        result = b instanceof B;
        //System.out.println(result);


        a = new B();
        b = new B();

        result = a instanceof Object;

        result = a instanceof B;

        result = b instanceof A;

        result = b instanceof B;

        result = d instanceof A;

        //result = d instanceof B;

    }

}
