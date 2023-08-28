import java.util.Scanner;

/**
 * Main
 */
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        char operator;

        System.out.println("Please enter a Expression");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        operator = scan.next().charAt(0);
        switch (operator) {
            case '+':
                c = add(a, b);
                break;
            case '-':
                c = sub(a, b);
            case '*':
                c = multi(a, b);
            case '/':
                c = div(a, b);
        }

        System.out.println("result is " + c);
    }

    public static int sub(int a, int b) {
        return a / b;
    }
}
