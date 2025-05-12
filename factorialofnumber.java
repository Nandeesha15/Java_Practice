import java.util.Scanner;
public class factorialofnumber {

    public static int factorialofanumber(int n)
    {
         int factorial_variable = 1 ;
        for(int i = n; i>=1 ; i--){
            factorial_variable = factorial_variable * i;
        }
        return factorial_variable;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        if(n == 0 )
        {
            
            System.out.println("FACTORIAL : 1 ");
        }
        else if (n <1){
            
            System.out.println("job cannot be done");
        }
        else
        {
            int factorial = factorialofanumber(n);
            System.out.println("FACTORIAL : " + factorial);
        }
        

        }
    }


    

