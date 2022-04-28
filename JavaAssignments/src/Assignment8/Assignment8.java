package Assignment8;

public class Assignment8 {
  public static void main(String[] args) {
    try {
      int a = 5/0;
      int arr [] = {1, 2, 3, 4, 5};
      arr[6] = 3;
      String str = "nikhil";
      char ch = str.charAt(10);
    } catch ( ArithmeticException e) {
      e.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
    } catch (StringIndexOutOfBoundsException e) {
      e.printStackTrace();
    }
    finally {
      System.out.println("Finally clause is executed");
    }
  }
}
