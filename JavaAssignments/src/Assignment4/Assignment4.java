package Assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment4 {

  public static void main(String[] args) throws ParseException {
    Assignment4 kyc = new Assignment4();
    Scanner scanner = new Scanner(System.in);
    int testCases = scanner.nextInt();
    String signupDate, currentDate;
    String input;
    for (int i = 0; i < testCases; i++) {
      signupDate = scanner.next();
      currentDate = scanner.next();
      kyc.rangeKYC(signupDate, currentDate);
    }
  }

  private void rangeKYC(String signupDate, String currentDate) throws ParseException {
    SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
    Date signup = dateFormatter.parse(signupDate);
    Date current = dateFormatter.parse(currentDate);
    if (signup.after(current)) {
      System.out.println("No range");
    } else {
      Date startDate = signup;
      startDate.setYear(current.getYear());

      Calendar cal= Calendar.getInstance();
      cal.setTime(startDate);
      cal.add(Calendar.DATE, -30);
      startDate = cal.getTime();
      cal.add(Calendar.DATE, 60);
      Date endDate = cal.getTime();
      if(endDate.after(current)) {
        endDate = current;
      }
      System.out.println(dateFormatter.format(startDate) + " " + dateFormatter.format(endDate));
    }
  }
}
