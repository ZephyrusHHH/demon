package lec021;


public class LOL_Heros {
    public void hero() {
        System.out.println("This is a LOL Hero");
    }

    protected String sex = "Unknown";
    protected int location = 0;
    float number = 0.0f;
    int number_1 = 0;
    long number_2 = 0L;


    public static void main(String[] args) {
        LOL_Heros temp = new LOL_Heros();
        temp.location = 11;
    }
}

class Jinx extends LOL_Heros {

    public void hero(int ages) {
        super.hero();
        System.out.println(ages);
        System.out.println("My name is lec021.Jinx");
    }

    protected String sex = "female";
    protected int location = 1;

    public static void main(String[] args) {
        Jinx jinx_1 = new Jinx();
        System.out.println(jinx_1.sex);
        int age = 23;

        jinx_1.hero(age);

        age = age + 1;
        System.out.println(age);
        long creditCardNumber = 1234_5678_9012_3456L;
        System.out.println(creditCardNumber);
    }
}



