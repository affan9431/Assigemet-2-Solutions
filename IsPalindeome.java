import java.util.Scanner;

public class IsPalindeome {

    public static void isPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str = sc.nextLine().toLowerCase().replace(" ", "");
        char ch;
        String nsch = "";

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nsch = ch + nsch;

        }

        if (str.equals(nsch)) {
            System.out.println("Yes it is palindrome.");
        } else
            System.out.println("No it is not palindrome.");

    }

    public static void main(String[] args) {

        int key;
        boolean continueProgram = true;

        while (continueProgram) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1) Press 1 to continue");
            System.out.println("2) Press 2 to exit");
            System.out.println("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                continue;
            }
            key = sc.nextInt();

            switch (key) {
                case 1:
                    isPalindrome();
                    break;
                case 2:
                    System.out.println("Exiting the program...");
                    continueProgram = false;
                    break;

                default:
                    System.out.println("Invalid input, please enter a valid choice");
                    break;
            }
        }

    }

}
