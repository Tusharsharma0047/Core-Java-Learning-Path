public class Escape_Sequences {
    public static void main(String[] args) {
        // 1. \n - New Line
        // 2. \t - Tab (Space)
        // 3. \' - Single Quote
        // 4. \" - Double Quote
        // 5. \\ - Backslash

        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);

        String textWithQuotes = "He said, \"Java is awesome!\"";
        System.out.println(textWithQuotes);
        
        String path = "C:\\Users\\Tushar\\Documents";
        System.out.println("File Path: " + path);
    }
}
