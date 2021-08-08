package lec4;

public class InitialBlock {

    {
        System.out.println("In non-static initialization block!");
    };

    static {
        System.out.println("In static initialization block!");
    };

    public InitialBlock() {
        System.out.println("In Constructor1!");
    }

    public void show() {
        System.out.println("In show()!");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        InitialBlock ti = new InitialBlock();
        ti.show();
    }

}