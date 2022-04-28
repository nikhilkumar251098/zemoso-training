package Assignment12;

public class Student {
  int id;
  String name;
  int age;
  String gender;
  String engineeringDepartment;
  int yearOfEnrollment;
  double percentageTillDate;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getEngineeringDepartment() {
    return engineeringDepartment;
  }

  public void setEngineeringDepartment(String engineeringDepartment) {
    this.engineeringDepartment = engineeringDepartment;
  }

  public int getYearOfEnrollment() {
    return yearOfEnrollment;
  }

  public void setYearOfEnrollment(int yearOfEnrollment) {
    this.yearOfEnrollment = yearOfEnrollment;
  }

  public double getPercentageTillDate() {
    return percentageTillDate;
  }

  public void setPercentageTillDate(double percentageTillDate) {
    this.percentageTillDate = percentageTillDate;
  }

  public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double perTillDate) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.engineeringDepartment = engDepartment;
    this.yearOfEnrollment = yearOfEnrollment;
    this.percentageTillDate = perTillDate;
  }
}
