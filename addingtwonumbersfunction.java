import java.util.Scanner;
public class addingtwonumbersfunction {

    public static int numbers(int a , int b ){
        return (a + b) ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a : ");

        int a = sc.nextInt();
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();

        int answer = numbers( a , b);
        System.out.println("by adding a and b answer is : ");
        System.out.println(answer);



        
    
    }
        
    
    
}
