import java.util.Scanner;
public class multiplyingtwonumbersfunction {

    public static float multiply_numbers(float a , float b ){
        float c = a*b;
        return c;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a :");
        float a = sc.nextFloat();

        System.out.println("enter the value of b :");
        float b = sc.nextFloat();

        float answer = multiply_numbers(a,b);
        System.out.println("multiplication of a and b is "+answer);
    }

    
}
