package Assignment7;

interface I1{
  public void m1();
  public void m2();
}
interface I2{
  public void m3();
  public void m4();
}
interface I3{
  public void m5();
  public void m6();
}
interface combine extends I1,I2,I3{
  public void method();
}
class ConcreteClass{
  public void methodinConcreteClass(){
    System.out.println("Iam a concrete class Method");
  }
}
class ImplementationClass extends  ConcreteClass implements  combine {
  @Override
  public void m1() {
    System.out.println("M1 method in ");
  }
  @Override
  public void m2() {
    System.out.println("M2 method");
  }
  @Override
  public void m3() {
    System.out.println("M3 method");
  }
  @Override
  public void m4() {
    System.out.println("M4 method");
  }
  @Override
  public void m5() {
    System.out.println("M5 method");
  }
  @Override
  public void m6() {
    System.out.println("M5 method");
  }
  @Override
  public void method() {
    System.out.println("method in combine interface");
  }
  public void method1st(I1 interface1){
    System.out.println("Interface1 as a Parameter");
  }
  public void method2nd(I2 interface2){
    System.out.println("Interface2 as a Parameter");
  }
  public void method3rd(I3 interface3){
    System.out.println("Interface3 as a Parameter");
  }
  public void method4th(combine interface4){
    System.out.println("Combine Interface as a Parameter");
  }
}
public class InterfaceImplementation    {
  public static void main(String[] args) {
    ImplementationClass obj=new ImplementationClass();
    obj.method1st(obj);
    obj.method2nd(obj);
    obj.method3rd(obj);
    obj.method4th(obj);
  }
}
