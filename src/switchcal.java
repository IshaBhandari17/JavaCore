import java.util.Scanner;

public class switchcal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation you want to perform");
        char operator= sc.next().charAt(0);
        System.out.println("Enter the first number");
        int firstNumber = sc.nextInt();
        System.out.println("enter second number");
        int secondNumber = sc.nextInt();
        int result = 0;
        switch(operator){
            case '+':
            {result =firstNumber+secondNumber;
                break;
            }
            case '-':
            {result = firstNumber-secondNumber;
                break;
            }
            case '*':
            {result = firstNumber* secondNumber;
                break;
            }
            case '/':
            {result = firstNumber/secondNumber;
                break;
            }
            default:
            {System.out.println("Sorry operator not found");}
        } System.out.println(result);

    }
}
