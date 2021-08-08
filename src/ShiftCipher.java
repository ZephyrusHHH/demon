import java.util.Arrays;
import java.util.Scanner;

public class ShiftCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        int shiftValue = in.nextInt();
        char[] textArray = text.toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            int chrAscii = (int) textArray[i];
            boolean conditionLower = (chrAscii >= (int) 'a' && chrAscii <= (int) 'z');
            boolean conditionUpper = (chrAscii >= (int) 'A' && chrAscii <= (int) 'Z');
            if (conditionLower) {
                boolean lowerLimit = (chrAscii + shiftValue > (int) 'z');
                if (lowerLimit) {
                    int newChrAscii = chrAscii + shiftValue - (int) 'z' + (int) 'a' - 1;
                    System.out.print((char) newChrAscii);
                } else {
                    int newChrAscii = chrAscii + shiftValue;
                    System.out.print((char) newChrAscii);
                }

            } else {
                if (conditionUpper) {
                    boolean upperLimit = (chrAscii + shiftValue > (int) 'Z');
                    if (upperLimit) {
                        int newChrAscii = chrAscii + shiftValue - (int) 'Z' + (int) 'A' - 1;
                        System.out.print((char) newChrAscii);
                    } else {
                        int newChrAscii = chrAscii + shiftValue;
                        System.out.print((char) newChrAscii);
                    }
                } else {
                    System.out.print(textArray[i]);
                }
            }

        }
    }
}
