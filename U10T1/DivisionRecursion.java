public class DivisionRecursion {
    public static void main(String [] args) {
      int result = recursiveDivision(8);
      System.out.println(result); // the only print statement
    }
    
    // this non-void, recursive method returns an int
    public static int recursiveDivision(int num) {
      if (num == 0) {
        return 0;
      } else {
        return num + recursiveDivision(num / 2);
      }
    }
}
   
    

