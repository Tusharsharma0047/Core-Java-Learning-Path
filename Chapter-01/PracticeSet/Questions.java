import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Marks In Maths
        System.out.println("Enter the marks obtain in Maths");
        int marks_Maths = sc.nextInt();
       
        //Marks In cience
        System.out.println("Enter the marks obtain in Science ");
        int marks_Science = sc.nextInt();

        //Marks In S.S.T
        System.out.println("Enter the marks obtain in S.S.T");
        int marks_SST = sc.nextInt();

        //Marks In Hindi
        System.out.println("Enter the marks obtain in Hindi");
        int marks_Hindi = sc.nextInt();

        //Marks In English
        System.out.println("Enter the marks obtain in English");
        int marks_English = sc.nextInt();

        int sum = marks_Maths+marks_Science+marks_SST+marks_Hindi+marks_English;
        System.out.println(sum);

        Float percentage= (sum/500f)*100;

        System.out.println(percentage);



        
    }
    
}
