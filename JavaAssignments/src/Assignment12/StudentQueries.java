package Assignment12;

import java.util.*;
import java.util.stream.Collectors;

public class StudentQueries {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
    students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
    students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
    students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
    students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
    students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
    students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
    students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
    students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
    students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
    students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
    students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
    students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
    students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
    students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
    students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric",2019, 72.4));
    students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
    System.out.println("Printing Departments");
    System.out.println();
    printdepartments(students);
    System.out.println();
    System.out.println("names of all students who have enrolled after 2018");
    getNamesOfStudentsAfter2018(students);
    System.out.println();
    System.out.println("details of all male student in the computer science department");
    malesinCSE(students);
    System.out.println();
    System.out.println("male and female students ");
    maleFemaleFriends(students);
    System.out.println();
    System.out.println(" average age of male and female students");
    averageAge(students);
    System.out.println();
    System.out.println("student having highest percentage");
    highestPercentage(students);
    System.out.println();
    System.out.println("number of students in each department");
    numberOfStudentsInEachDepartment(students);
    System.out.println();
    System.out.println("average percentage achieved in each department");
    averagePercentageAchievedInEachDepartment(students);
    System.out.println();
    System.out.println("details of youngest male student in the Electronic department");
    youngestMaleStudentInElectronicDepartment(students);
    System.out.println();
    System.out.println("male and female students are there in the computer science department");
    studentsinCSE(students);

  }
  private static void highestPercentage(List<Student> list) {
    Optional<Student> student=list.stream()
        .collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPercentageTillDate)));
    Student s=student.get();
    System.out.println(s.name+","+s.id+","+s.name+","+s.age+","+s.gender+","+s.engineeringDepartment +","+
        s.yearOfEnrollment+","+s.percentageTillDate);

  }
  private static void studentsinCSE(List<Student> list) {
    Map<String,Long> h=list.stream()
        .filter(s->s.getEngineeringDepartment().equals("Computer Science"))
        .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
    System.out.println(h);

  }
  private static void youngestMaleStudentInElectronicDepartment(List<Student> list) {
    Optional<Student> youngest=list.stream()
        .filter(st->st.getEngineeringDepartment().equals("Electronic") && st.getGender().equals("Male"))
        .collect(
            Collectors.minBy(Comparator.comparingInt(Student::getAge)));
    Student s=youngest.get();
    System.out.println(s.name+","+s.id+","+s.name+","+s.age+","+s.gender+","+s.engineeringDepartment +","+
        s.yearOfEnrollment+","+s.percentageTillDate);

  }
  private static void averagePercentageAchievedInEachDepartment(List<Student> list) {
    Map<String, Double> h=list.stream()
        .collect(
            Collectors.groupingBy(Student::getEngineeringDepartment,Collectors.averagingDouble(Student::getPercentageTillDate)));
    System.out.println(h);


  }
  private static void numberOfStudentsInEachDepartment(List<Student> list) {
    Map<String,Long> h=list.stream()
        .collect(Collectors.groupingBy(Student::getEngineeringDepartment,Collectors.counting()));
    System.out.println(h);

  }
  private static void averageAge(List<Student> list) {

    Map<String, Double> avgAgeOfMaleAndFemaleEmployees=list.stream()
        .collect(Collectors.groupingBy
            (Student::getGender, Collectors.averagingInt(Student::getAge)));

    System.out.println(avgAgeOfMaleAndFemaleEmployees);

  }
  private static void maleFemaleFriends(List<Student> list) {
    Map <String, Long> byGender = list.stream()
        .collect(Collectors.groupingBy(p -> p.getGender(), Collectors.counting()));
    System.out.println(byGender);
  }
  private static void malesinCSE(List<Student> list) {
    List<Student> l=list.stream()
        .filter(m -> m.getEngineeringDepartment() == "Computer Science")
        .filter(m->m.getGender().equals("Male"))
        .collect(Collectors.toList());
    for(Student s:l)
      System.out.println(s.name+","+s.id+","+s.name+","+s.age+","+s.gender+","+s.engineeringDepartment +","+
          s.yearOfEnrollment+","+s.percentageTillDate);

  }
  private static void getNamesOfStudentsAfter2018(List<Student> list) {
    list.stream()
        .filter(sa->sa.getYearOfEnrollment()>2018)
        .map(Student::getName)
        .forEach(System.out::println);

  }
  private static void printdepartments(List<Student> list) {
    list.stream()
        .map(Student::getEngineeringDepartment)
        .distinct()
        .forEach(System.out::println);

  }
}
