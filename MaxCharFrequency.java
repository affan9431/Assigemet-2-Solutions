import java.util.Scanner;

public class MaxCharFrequency {

    public static int maximum(int i, int j) {
        if (i > j)
            return i;
        else
            return j;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any word & get the most repeated character: ");
        String name = scanner.nextLine();
        
        int mx = 0;

        for (int i = 0; i <  name.length() - 1; i++) {
            int count = 1;
            for (int j = i + 1; j <  name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                }
            }
            mx = maximum(mx, count);
        }

        int idx = -1;
        for (int i = 0; i <  name.length() - 1; i++) {
            int count = 1;
            for (int j = i + 1; j <  name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                }
                if (count == mx) {
                    idx = i;
                }
            }
        }

        if (idx != -1) {
            System.out.println(name.charAt(idx) + " -> " + mx);
        } else {
            System.out.println("No repeated characters found.");
        }

        scanner.close();
    }
}
