import java.util.Scanner;
public class checkingprimefunction {

    public static int prime_number(int n ){
        if ( n / 1== 0 || n / n ==0 || n <- 1)
        {
            System.out.println("number is not prime");
        }
        else{
            System.out.println("number is prime");
        }
        return n;

    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n =  sc.nextInt();
        prime_number( n );

    }
    
}
