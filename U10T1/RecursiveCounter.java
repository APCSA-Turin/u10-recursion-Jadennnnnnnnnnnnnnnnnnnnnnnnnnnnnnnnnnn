public class RecursiveCounter {
    public static void main(String [] args) {
        recursiveCounter(1);
    }

    public static void recursiveCounter(int number) {
        if (number < 11) {
            System.out.println(number);
            recursiveCounter(number + 1);
        }
    }
}

