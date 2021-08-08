package lec03;
//https://blog.csdn.net/qq_21480607/article/details/112687048
public class Switch {
    public static void main(String[] args) {
        // Standard
        int flag = 3;
        boolean test= false;
        switch (flag){

            case 0: System.out.println("The number is 0" ); break;
            case 1: System.out.println("The number is 1" ); break;
            case 2: System.out.println("The number is 2" ); break;
            default: System.out.println("you are right" ); break;
        }


        flag = 3;
        switch (flag){
            case 0 -> System.out.println("The number is 0" );
            case 1 -> System.out.println("The number is 1" );
            case 2 -> System.out.println("The number is 2" );
            default -> System.out.println("you are right" );
        }




        // yield

        flag = 2;
        String ss;
        ss = switch (flag){
            case 0 -> "The number is 0" ;
            case 1 -> "The number is 1" ;
            case 2 -> {
                String c = "The number is 2";
                yield c;
            }
            default -> "you are right" ;
        };
        System.out.println(ss);

    }
}
