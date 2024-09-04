import java.util.Scanner;

public class Sort {
    public static String sort(String string) {
        char[] charArray = string.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String str;
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
            sc.nextLine();

            switch (key) {
                case 1:
                    System.out.println("Enter the string:: ");
                    str = sc.nextLine();
                    String sortedString = sort(str);
                    System.out.println("Sorted String: " + sortedString);
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
