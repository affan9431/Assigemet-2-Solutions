public class Shift {
    public static void shift(String string, int n) {
        String output = "";
        for (int i = 0; i < string.length(); i++) {
            if (i < string.length() - n) {
                output += string.charAt(i);
            }
            // else if(i)
            System.out.println(string.charAt(i));
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        shift("abcdefg", 3);
    }

}
