package Assignment9;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {
  public static boolean check(String str) {
    Pattern p = Pattern.compile("^[A-Z].*\\.$");
    Matcher m = p.matcher(str);
    return m.matches();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    if (check(str)) {
      System.out.println("The string begins with capital letter and ends with a period");
    } else {
      System.out.println("The string doesn't begin with a capital letter or ends with a period");
    }
  }
}