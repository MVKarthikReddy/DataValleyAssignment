import java.util.Scanner;

public class CountVarCon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //1.Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase();  // Converting string to lowercase
        
        // 2. to Count vowels and consonants
        int vowelsCount = 0;
        int consonantsCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        
        // Output result
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
        
        scanner.close();
    }
}