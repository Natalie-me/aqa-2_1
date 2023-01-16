import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите a: ");
        int a = sc.nextInt();
        System.out.println("Введите b: ");
        int b = sc.nextInt();

        int sum = 0;

        if (b >= a) {
            for (int i = a; i <= b; i++)
                sum = sum + i;
            System.out.println(sum);
        } else {
            System.out.println("Error");
        }
    }
}
