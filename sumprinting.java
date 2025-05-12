import java.util.Scanner;
public class sumprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of num :");
        int num = sc.nextInt();
        int result = 0;
        int i = 1 ;


        for(i=1;i<=num;i++)
        {
            result = result + i;
        }
        System.out.println(result);
    }
}

            


        

        
        
