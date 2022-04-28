package Assignment7;

public class ConstructorClass {
  public static void main(String[] args) {
    SecondClass.SecondInnerClass s1=new SecondClass.SecondInnerClass();
    // Prints 20
  }
}

class FirstClass{
  static class FirstInnerClass{
    public FirstInnerClass(int id){
      System.out.print("My id:"+id);
    }
  }
}

class SecondClass {
  static class SecondInnerClass extends FirstClass.FirstInnerClass {
    public SecondInnerClass() {
      super(20);
    }
  }
}

