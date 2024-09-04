import java.util.Scanner;

public class AppendString {
    static String output = " ";

    public static void append(String newString) {

        output += newString + " ";
        System.out.println("Output String: " + output);

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
                System.out.println("Please enter valid number");
                continue;
            }

            key = sc.nextInt();

            sc.nextLine();

            switch (key) {
                case 1:
                    System.out.println("Enter string:: ");
                    str = sc.nextLine();

                    append(str);
                    break;
                case 2:
                    System.out.println("Exiting the program...");
                    continueProgram = false;
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }

        }

        append("world");

    }

}
