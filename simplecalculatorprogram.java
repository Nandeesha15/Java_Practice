import java.util.Scanner;
public class simplecalculatorprogram {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a :");
        double a = sc.nextDouble();
        System.out.println("enter the value of b :");
        double b = sc.nextDouble();
        System.out.println("enter the operands like +,-,*,/,% :");
        char operator = sc.next().charAt(0);
        double c = 0.0;


        switch(operator)
       
        {
            case '+' : 
            c = a + b;
            break;

            case '-' : 
            c = a - b;
            break;

            case '*' :
            c = a * b;
            break;

            case '/' :
            c = a / b;
            break;

            case '%' :
            c = a % b;
            break;

            default: 
            System.out.println("invalid operator");
        }
        System.out.println("result is " + c);
        

    }
}



            




        
