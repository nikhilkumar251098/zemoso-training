package Assignment7;

interface Cycles{
  public  void  cost();
}
class UniCycle implements  Cycles{
  @Override
  public void cost() {
    System.out.println("Costs less");
  }
}
class BiCycle implements Cycles{
  @Override
  public void cost() {
    System.out.println("Costs medium");
  }
}
class TriCycle implements  Cycles{
  @Override
  public void cost() {
    System.out.println("Costs more");
  }
}
class Implementation {
  public  Cycles knowCost(String str){
    if(str.equalsIgnoreCase("unicycle")) {
      return new UniCycle();
    }
    else if(str.equalsIgnoreCase("bicycle"))
      return new BiCycle();
    else if(str.equalsIgnoreCase("tricycle"))
      return new TriCycle();
    return null;
  }
}
public class CycleInterfaces {
  public static void main(String[] args) {
    Implementation obj=new Implementation();
    obj.knowCost("unicycle").cost();
    obj.knowCost("bicycle").cost();
    obj.knowCost("tricycle").cost();
  }
}
