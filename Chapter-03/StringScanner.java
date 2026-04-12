import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your full name with extra spaces:");
        // Using nextLine() to read the whole sentence, not just one word
        String input = sc.nextLine();

        // Let's perform a "Clean Up" sequence
        String cleaned = input.trim().replace(" ", "_");
        
        System.out.println("Original: " + input);
        System.out.println("Cleaned for Username: " + cleaned.toLowerCase());
        
        // Check if a specific word exists
        System.out.println("Does it contain 'Harry'? " + cleaned.contains("Harry"));
    }
}
