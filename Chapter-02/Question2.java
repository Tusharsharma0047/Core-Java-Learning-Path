public class Question2 {
    public static void main(String[] args) {
        char grade = 'b';

        // Encrypting the grade
        char encryptedGrade = (char) (grade + 8);
        System.out.println("Encrypted Grade: " + encryptedGrade);

        // Decrypting the grade
        char decryptedGrade = (char) (encryptedGrade - 8);
        System.out.println("Decrypted Grade: " + decryptedGrade);
    }
}
