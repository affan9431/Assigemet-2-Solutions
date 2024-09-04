import java.util.Scanner;

public class Reverse {
    public static String reverse() {

        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
        char character;
        String reverseString = "";

        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            reverseString = character + reverseString;
        }

        return reverseString;
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
                    String reverseString = reverse();
                    System.out.println("Reverse String: " + reverseString);
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
