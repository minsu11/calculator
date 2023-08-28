import java.util.Scanner;

/**
 * Main
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1, number2, result;
        char operator;

        System.out.println("Please enter a Expression : ");
        number1 = scan.nextInt(); number2 = scan.nextInt(); result = scan.nextInt();
        operator = scan.next().charAt(0);
        switch(operator){
            case '+':
                result = add(number1,number2);
                break;
            case '-':
                result = sub(number1,number2);
            case '*':
                result = multi(number1, number2);
            case '/':
                result = div(number1,  number2);
        }

        System.out.println("result is " + result);
    }
    public static int multi(int number1, int number2){
        return number1 * number2;
    }
}