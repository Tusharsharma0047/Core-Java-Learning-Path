import java.util.Scanner;

public class ElseIfCondition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 80) {
            System.out.println("Person is in old age.");
        } else if (age >= 60) {
            System.out.println("Person is senior.");
        } else if (age >= 40) {
            System.out.println("Person is middle-aged.");
        } else if (age >= 20) {
            System.out.println("Person is young.");
        } else if (age >= 10) {
            System.out.println("Person is a student.");
        } else {
            System.out.println("Person is a child.");
        }

        sc.close();
    }
}
