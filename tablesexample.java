import java.util.Scanner;
public class tablesexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of num :");
        int num = sc.nextInt();
        
        int i = 1 ;


        for(i=1;i<=10;i++)
        {
            System.out.println("tables : "+ num*i);
            
        }
        
    }
}
    

