package Assignment7;

interface Rodent{
  boolean isMammal();
  void characteristics();
}
interface Mouse extends Rodent{
  void characteristics();
}
interface Gerbil extends Rodent{
  void characteristics();
}
class MouseClass  extends RodentClass implements Mouse{
  public MouseClass() {
    System.out.println("In the Mouse Class");
  }
  public boolean isMammal() {
    return true;
  }
  public void characteristics() {
    System.out.println("slender body with blunt or tapered muzzle");
  }
}
class GerbilClass extends RodentClass implements Gerbil{
  public GerbilClass() {
    System.out.println("In the Gerbil Class");
  }
  public boolean isMammal() {
    return true;
  }
  public void characteristics() {
    System.out.println("They will play, chasing each other around, wrestling and boxing");
  }

}
class RodentClass implements Rodent {
  public RodentClass() {
    System.out.println("In the Rodent Class");
  }
  public boolean isMammal() {
    return true;
  }
  public void characteristics() {
    System.out.println("Their teeth grow throughout the life");

  }
}
public class InheritenceHierarchy {
  public static void main(String[] args) {
    String[] rodents = {"Mouse", "Gerbil"};
    RodentClass r = new RodentClass();
    r.characteristics();

  }
}
