package Assignment11;

import java.io.*;
import java.util.*;

public class Assignment11 {
  public static void main(String[] args) throws FileNotFoundException {
    try {
      File input = new File("src/Assignment11/" + args[0]);
      File output = new File("src/Assignment11/output.txt");
      System.out.println(input.getAbsolutePath());
      Scanner scanner = new Scanner(input);
      PrintWriter printer = new PrintWriter(output);
      Map<Character, Integer> map = new HashMap<>();
      while (scanner.hasNextLine()) {
        String str = scanner.nextLine();
        for (char i : str.toCharArray()) {
          map.put(i, map.getOrDefault(i, 0) + 1);
        }
      }
      for (char c: map.keySet()) {
        printer.println(c + " -> " + map.get(c));
      }
      scanner.close();
      printer.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
