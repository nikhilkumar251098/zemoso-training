package Assignment7;

class Cycle {

}
class Unicycle extends Cycle{
  public void balance() {
    System.out.println("Balancing in Uni-cycling");
  }
}
class Bicycle extends Cycle{
  public void balance() {
    System.out.println("Balancing in Bicycling");
  }
}
class Tricycle extends Cycle{

}
public class CycleClass {
  public static void main(String[] args) {
    // UpCasting
    Unicycle u=new Unicycle();
    Bicycle b=new Bicycle();
    Tricycle t=new Tricycle();
    Cycle[] arr= {(Cycle)u , (Cycle)b , (Cycle)t };
    for(int i=0;i<3;i++) {
      Cycle c1=arr[i];
      // c1.balance(); // The method balance() is undefined for the type Cycle
    }
    // DownCasting
    Cycle c1=new Unicycle();
    ((Unicycle)c1).balance();
    Cycle c2=new Bicycle();
    ((Bicycle)c2).balance();
    Cycle c3=new Tricycle();
    //  ((Tricycle)c3).balance();  // The method balance() is undefined for the type Tricycle(
  }
}