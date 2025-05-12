import java.util.Scanner;
public class stringexample {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("enter the student name :");    
String name = sc.next();
System.out.println("enter the maths marks :");    
double marks1 = sc.nextInt();
System.out.println("enter the science marks :");    
double marks2 = sc.nextInt();
System.out.println("enter the social marks :");    
double marks3 = sc.nextInt();
System.out.println("enter the kannada marks :");    
double marks4 = sc.nextInt();
System.out.println("enter the english marks :");    
double marks5 = sc.nextInt();

double total_marks = ((marks1+marks2+marks3+marks4+marks5)/500)*100;

System.out.println("total marks obtained in percentage :" + total_marks);
}
}




    

    
   