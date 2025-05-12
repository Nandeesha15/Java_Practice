import java.util.Scanner;
public class exampleoffunction {

    public static void nameingfunction(String name)
    {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name : ");
        String name = sc.next();

    
        nameingfunction(name);
    }

    


    
    
}
