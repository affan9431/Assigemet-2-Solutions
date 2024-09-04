import java.util.Scanner;

public class Splice {
    public static void splice(String string, int startIndex, int length) {
        String output = "";

        for (int i = 0; i < string.length(); i++) {
            if (i >= startIndex && i < startIndex + length) {
                continue;
            } else {
                output += string.charAt(i);
            }

        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        int key;
        String str;
        int start, length;
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
                    System.out.println("Enter the String");
                    str = sc.next();
                    System.out.println("Enter the start index:: ");
                    start = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the length:: ");
                    length = sc.nextInt();
                    splice(str, start, length);
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
