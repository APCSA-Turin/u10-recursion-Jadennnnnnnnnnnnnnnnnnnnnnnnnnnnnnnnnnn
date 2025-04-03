public class StringRecursion {
    public static void main(String[] args) {
        System.out.println(recurseString("computer"));
    }

    // recursive method that returns a String
    public static String recurseString(String str) {
        if (str.length() == 1 ) {
            return str;
        } else {
            String firstLetter = str.substring(0, 1);
            return recurseString(str.substring(1)) + firstLetter;
        }
    }
}
