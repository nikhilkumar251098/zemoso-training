package Assignment6;

import java.util.*;

public class Assignment6 {

  private static int numberOfDigits(long num) {
    return Long.toString(Math.abs(num)).length();
  }
  public static boolean findFactors(long num, long fact1, long fact2) {
    if (Long.toString(fact1).endsWith("0") && Long.toString(fact2).endsWith("0"))
      return false;
    int length = numberOfDigits(num);
    if (numberOfDigits(fact1) != length / 2 || numberOfDigits(fact2) != length / 2)
      return false;
    byte[] bytes = Long.toString(num).getBytes();
    byte[] factorBytes = (Long.toString(fact1) + Long.toString(fact2)).getBytes();
    Arrays.sort(bytes);
    Arrays.sort(factorBytes);
    return Arrays.equals(bytes, factorBytes);
  }
  public static void main(String[] args) {
    HashSet<Long> vampireNumbers = new HashSet<>();
    for (long num = 10; vampireNumbers.size() <= 99; num++) {
      if ((numberOfDigits(num) % 2) != 0) {
        num = num * 10 - 1;
        continue;
      }
      for (long i = 2; i <= Math.sqrt(num) + 1; i++) {
        if (num % i == 0) {
          long j = num / i;
          if (findFactors(num, i, j) && i <= j) {
            vampireNumbers.add(num);
            System.out.println(num + ": [" + i + ", " + j + "]");
          }
        }
      }
    }
  }
}
