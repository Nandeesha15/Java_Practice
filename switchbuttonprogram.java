import java.util.Scanner;
public class switchbuttonprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button)
        {
            case 1 : System.out.println("hi");
            break;

            case 2 : System.out.println("hello");
            break;

            case 3 : System.out.println("namasthe");
            break;

            default : System.out.println("key not found");
        }
    }
}


            

            
           
