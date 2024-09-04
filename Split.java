import java.util.Scanner;

public class Split {

    public static void split(String string) {
        String[] arr = new String[string.length()];
        String output = "";
        int index = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                if (!output.isEmpty()) {
                    arr[index] = output;
                    index++;
                }
                output = "";
            } else {
                output += string.charAt(i);
            }
        }

        if (!output.isEmpty()) {
            arr[index] = output;
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("<---------->");

    }

    public static void main(String[] args) {
        int key;
        boolean continueProgram = true;
        String str;

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
                    System.out.println("<------------>");
                    split(str);
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