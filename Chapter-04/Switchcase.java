public class Switchcase {
    public static void main(String[] args) {
        int age = 67;

        switch (age) {
            case 18:
                System.out.println("Person is adult");
                break;
            case 23:
                System.out.println("Person is rready for the job");
                break;
            case 45:
                System.out.println("Person is in there max young age");
                break;
            default:
                System.out.println("Person is old age");
                break;
        }
    }
    
}
