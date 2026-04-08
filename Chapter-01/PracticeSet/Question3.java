import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks In The First Subject");
        float marks1=sc.nextFloat();

        System.out.println("Enter Marks In The Second Subject");
        float marks2=sc.nextFloat();
        
        System.out.println("Enter Marks In The Third Subject");
        float marks3=sc.nextFloat();


        float Total=marks1+marks2+marks3;
        System.out.println("The Total Marks Obatin By The Student "+ Total);

        float CGPA= (Total)/30;
        System.out.println("The CGPA Getting By The Student Is " +CGPA );
    }
    
}
