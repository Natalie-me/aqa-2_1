import java.util.Scanner;

public class CycleWhileDoWhile {
    public static void main(String[] args) {

        int start = 10;
        while (start <=30) {
            System.out.println(start);
            start++;
        }

        do {
            System.out.println(start);
            start++;
        } while (start <=30);

    }
}
